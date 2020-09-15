package com.example.bootes.estest;


import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHits;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

/**
 * @author lxl
 * @date 2020/9/15 9:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Estest {

    @Autowired
    private TransportClient transportClient;

    private  String INDEX="customer";
    private String TYPE="users";

    /**
     * 增加
     * @throws IOException
     */
    @Test
    public void testAddEs() throws IOException {
        XContentBuilder builder = jsonBuilder().startObject()
        .field("userName","linxuelei")
        .field("password","testpassword")
        .field("createtime","2020-09-15")
        .endObject();

        transportClient.prepareIndex(INDEX, TYPE).setId("123334455").setSource(builder).get();

    }

    /**
     * 查询
     */
    @Test
    public void searchaEs(){
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();
        boolQueryBuilder.must(QueryBuilders.multiMatchQuery("linxuelei", "userName"));
        SearchRequestBuilder searchRequestBuilder = transportClient.prepareSearch(INDEX).setSearchType(SearchType.DFS_QUERY_THEN_FETCH).setQuery(boolQueryBuilder);

        SearchHits hits = searchRequestBuilder.get().getHits();
        List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
        hits.forEach(hit -> {
            Map<String, Object> sourceAsMap = hit.getSourceAsMap();
            sourceAsMap.put("id", hit.getId());
            System.out.println(sourceAsMap.get("createtime"));
            data.add(sourceAsMap);
        });
    }

    /**
     * 删除
     */
    @Test
    public void delEs(){
        transportClient.prepareDelete(INDEX, TYPE, "123334455").get();
    }

}
