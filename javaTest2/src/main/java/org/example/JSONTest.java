package org.example;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author lxl
 * @date 2020/9/29 10:46
 */
public class JSONTest {

    public static void main(String[] args) {
        String jsonStr = "{\n" +
                "    \"success\": true,\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"DFEBB552-2ACA-473A-ABD1-01EF6015FE4B\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1583769600000,\n" +
                "            \"hsicrm_starttime\": 1583769600000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"家用空调\",\n" +
                "            \"hsicrmContractno\": \"HT00000100\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"家用空调\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583378598837\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"48F98CB2-607D-43F6-9E48-04527E179203\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590076799000,\n" +
                "            \"hsicrm_starttime\": 1590045724000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种 + 商用\",\n" +
                "            \"hsicrmContractno\": \"HT00001000\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"特种 + 商用\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583390904877\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"BDED079C-A05D-4C03-B463-06679525FBF9\",\n" +
                "            \"hsicrmContractname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000010\",\n" +
                "            \"hsicrmEntrytime\": 1583975737680\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"4044913A-DCAC-4ED4-A588-0F5DBE258683\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590076799000,\n" +
                "            \"hsicrm_starttime\": 1590045739000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000043\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"波轮售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmIndustryname\": \"成套\",\n" +
                "            \"hsicrmEntrytime\": 1583976069430\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"B6F1F9C9-753D-450A-B8D0-1065FB390749\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1583856000000,\n" +
                "            \"hsicrm_starttime\": 1583856000000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"平板 + 波轮\",\n" +
                "            \"hsicrmContractno\": \"HT00000900\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板 + 波轮\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583390843990\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"A8793A36-C3FE-4DEA-9B04-11AFE37B9D50\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584201600000,\n" +
                "            \"hsicrm_starttime\": 1584028800000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000062\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976246850\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"2A8E4215-3498-48E9-9D5C-1736A026CF47\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585065599000,\n" +
                "            \"hsicrm_starttime\": 1584955911000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000049\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976123103\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"1081E246-1A56-4457-8067-17EC4016D95B\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584979199000,\n" +
                "            \"hsicrm_starttime\": 1584949020000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000050\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976127447\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"217A0178-2AEC-4A28-86B5-1FBD16115BC1\",\n" +
                "            \"hsicrmContractname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000001\",\n" +
                "            \"hsicrmEntrytime\": 1583975633543\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"AFCD7D81-2573-4A67-9BF5-214A1C143015\",\n" +
                "            \"hsicrmContractname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000047\",\n" +
                "            \"hsicrmEntrytime\": 1583976115307\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"76998FB1-CE8F-4C52-886A-24BF362CCA55\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1582339200000,\n" +
                "            \"hsicrm_starttime\": 1582214400000,\n" +
                "            \"hsicrmAttribute4\": \"已公示\",\n" +
                "            \"hsicrmPmname\": \"测试\",\n" +
                "            \"hsicrmContractno\": \"HTTEST000002\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"工程合同测试2\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmIsbid\": true,\n" +
                "            \"hsicrmEntrytime\": 1581990582420\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"9809565E-069F-48CC-B1EB-28459106D035\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1583942400000,\n" +
                "            \"hsicrm_starttime\": 1583856000000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"家用空调 + 热水器\",\n" +
                "            \"hsicrmContractno\": \"HT00000800\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"家用空调 + 热水器\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583390783983\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C9DE6D68-FC89-4D5A-8F78-2ADD47ED2637\",\n" +
                "            \"hsicrmContractname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000014\",\n" +
                "            \"hsicrmEntrytime\": 1583975784313\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"12178041-92DB-4742-8FBE-2B1713228A38\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1596124799000,\n" +
                "            \"hsicrm_starttime\": 1590119068000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000056\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976201543\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"D62F7341-7C2B-4385-8CFE-2D932681D05C\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1583683200000,\n" +
                "            \"hsicrm_starttime\": 1583683200000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"测试111\",\n" +
                "            \"hsicrmContractno\": \"HT00000002\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"全流程测试22\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583291340763\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"48A033D6-D568-4CA6-B2BC-2ECF3D618EA4\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584201600000,\n" +
                "            \"hsicrm_starttime\": 1583856000000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"商用空调\",\n" +
                "            \"hsicrmContractno\": \"HT00000400\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"商用空调\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583390303230\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"4532E217-FD91-4FE3-AAB9-2F621A887624\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590076799000,\n" +
                "            \"hsicrm_starttime\": 1590045468000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000042\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"波轮售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976066470\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"E55BB11B-C6CA-4828-BCB7-343E553583B7\",\n" +
                "            \"hsicrmContractname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000039\",\n" +
                "            \"hsicrmEntrytime\": 1583976027730\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"57917FC9-2E60-4CC9-AA03-35D34E82CF45\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585151999000,\n" +
                "            \"hsicrm_starttime\": 1584950634000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000025\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975896393\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C90970F9-A17F-4E3A-BC07-3C40499BF40A\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590076799000,\n" +
                "            \"hsicrm_starttime\": 1590045434000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000060\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976218107\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C4E0A377-6466-450A-98D5-3D629AB705F5\",\n" +
                "            \"hsicrmContractname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000005\",\n" +
                "            \"hsicrmEntrytime\": 1583975688300\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"A085FBA8-D19B-41F5-B154-3E0303023B7A\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590249599000,\n" +
                "            \"hsicrm_starttime\": 1590198637000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000018\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975839907\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"A78CD6CE-669A-4C84-A376-44EA67F1C3C4\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585065599000,\n" +
                "            \"hsicrm_starttime\": 1584952143000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000026\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975924287\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"FEC935C1-2FFB-4243-8B52-45E7300E6716\",\n" +
                "            \"hsicrmContractname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000011\",\n" +
                "            \"hsicrmEntrytime\": 1583975775673\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"05DC58C0-13E1-4EEE-943D-467BA1CD0C07\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584806399000,\n" +
                "            \"hsicrm_starttime\": 1584695807000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000028\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975931267\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"F9B404AE-6E21-451D-B7DC-4BC1A7F066EC\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1582902000000,\n" +
                "            \"hsicrm_starttime\": 1582473600000,\n" +
                "            \"hsicrmAttribute4\": \"已公示\",\n" +
                "            \"hsicrmPmname\": \"测试5\",\n" +
                "            \"hsicrmContractno\": \"HTTEST000005\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"工程合同测试5\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmEntrytime\": 1581990742570\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"宁波欧琳厨具有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"AA9F6EE7-DEB5-478F-882A-4BC3A48AC25F\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1581782400000,\n" +
                "            \"hsicrm_starttime\": 1581782400000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"王姝琪\",\n" +
                "            \"hsicrmContractno\": \"HCC对接测试000001\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"HCC对接测试1\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmPaymentterms\": 100000005,\n" +
                "            \"hsicrmEntrytime\": 1581475056013\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"7608462C-C63C-47F3-8ACB-4CE84A6E9C82\",\n" +
                "            \"hsicrmContractname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000031\",\n" +
                "            \"hsicrmEntrytime\": 1583975971557\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"7D52D216-B1B4-4FF6-9B17-4DB7C75A1058\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1588867199000,\n" +
                "            \"hsicrm_starttime\": 1588148415000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000017\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975835607\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"FB6F349F-B520-49EB-9432-50BAB08304BA\",\n" +
                "            \"hsicrmContractname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000002\",\n" +
                "            \"hsicrmEntrytime\": 1583975676733\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"F8F06FF5-18F2-4238-BD02-51B03770D908\",\n" +
                "            \"hsicrmContractname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000007\",\n" +
                "            \"hsicrmEntrytime\": 1583975723730\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"F3C90CDA-066F-446F-8629-53F7E871CF2A\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584806399000,\n" +
                "            \"hsicrm_starttime\": 1584601886000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"测试\",\n" +
                "            \"hsicrmContractno\": \"HT10555550\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"测试\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1584506130167\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"6B633C65-E223-438E-ABF8-55EBEFE5B68F\",\n" +
                "            \"hsicrmContractname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000038\",\n" +
                "            \"hsicrmEntrytime\": 1583976023720\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"宁波欧琳厨具有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C644B7E4-7C90-4998-8247-5723127EFF6B\",\n" +
                "            \"hsicrmContractname\": \"HCC对接测试1\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmPmname\": \"王姝琪\",\n" +
                "            \"hsicrmContractno\": \"HCC对接测试66\",\n" +
                "            \"hsicrmEntrytime\": 1581496098250\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C86ED3E7-D51C-4EB2-8304-5764AED8117A\",\n" +
                "            \"hsicrmContractname\": \"平板电视\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"平板电视\",\n" +
                "            \"hsicrmContractno\": \"HT00000300\",\n" +
                "            \"hsicrmEntrytime\": 1583390199237\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"5EE4D706-B2AD-4D52-B629-5D0DE846990E\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584719999000,\n" +
                "            \"hsicrm_starttime\": 1584594180000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000019\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975842970\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"3DF4EFEC-6B2A-4B20-86A4-5F804128BAEB\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱\",\n" +
                "            \"hsicrmContractno\": \"HT00000600\",\n" +
                "            \"hsicrmEntrytime\": 1583390483910\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"1957DBFD-02A5-426D-824F-621339D957FA\",\n" +
                "            \"hsicrmContractname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000012\",\n" +
                "            \"hsicrmEntrytime\": 1583975779223\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"240E6303-094A-44BF-82B3-63234615A929\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585670399000,\n" +
                "            \"hsicrm_starttime\": 1584608101000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000036\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976016520\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"D063916E-CBAC-4FDB-8A8E-6394DDE78459\",\n" +
                "            \"hsicrmContractname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000046\",\n" +
                "            \"hsicrmEntrytime\": 1583976111557\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"5B097802-20F5-4102-9CB7-6520AA932BE2\",\n" +
                "            \"hsicrmContractname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000008\",\n" +
                "            \"hsicrmEntrytime\": 1583975727420\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"9D71D93A-CD03-48A4-89B0-68C75F232771\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590854399000,\n" +
                "            \"hsicrm_starttime\": 1590119013000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000063\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976249630\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"758A910E-6458-4239-8EDE-6E140DB61E09\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585065599000,\n" +
                "            \"hsicrm_starttime\": 1585039732000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000029\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975935100\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"0FB61F42-15F7-4BE1-A444-6F77C9E1FB66\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590249599000,\n" +
                "            \"hsicrm_starttime\": 1590043118000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"吸油烟机自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000069\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"吸油烟机自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976299873\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"3E343E18-B5C0-4E2C-94A9-710EE6C37EAE\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585238399000,\n" +
                "            \"hsicrm_starttime\": 1585114129000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"测试\",\n" +
                "            \"hsicrmContractno\": \"HT1888888\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"测试\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1585114109573\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"905CD904-0E6E-4396-A6BD-75B324BD18CC\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1583942400000,\n" +
                "            \"hsicrm_starttime\": 1583942400000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000009\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"家用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975731020\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C8324B4A-9703-492A-82CC-76FD1ADA85FC\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1583337600000,\n" +
                "            \"hsicrm_starttime\": 1583251200000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"测试111\",\n" +
                "            \"hsicrmContractno\": \"HTTEST000111\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"工程合同测试111\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583127731220\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"AA066430-9715-4728-A12F-7CAE2EC24B74\",\n" +
                "            \"hsicrmContractname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000013\",\n" +
                "            \"hsicrmEntrytime\": 1583975781770\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"38B23FD6-7424-42DC-937D-84752ABDDC16\",\n" +
                "            \"hsicrmContractname\": \"热水器\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"热水器\",\n" +
                "            \"hsicrmContractno\": \"HT00000200\",\n" +
                "            \"hsicrmEntrytime\": 1583388393580\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"F15A0651-04EE-4022-9C9E-8900B0A48833\",\n" +
                "            \"hsicrmContractname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000004\",\n" +
                "            \"hsicrmEntrytime\": 1583975685000\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"6FAD8D4F-6D90-4302-BB1F-89CACBE27E3C\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584028800000,\n" +
                "            \"hsicrm_starttime\": 1584028800000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000020\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975847573\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"02036321-AF14-4063-B729-92DAADAE6113\",\n" +
                "            \"hsicrmContractname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000023\",\n" +
                "            \"hsicrmEntrytime\": 1583975890203\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C0421582-2837-4D61-A8D3-93F9708BDC60\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000051\",\n" +
                "            \"hsicrmEntrytime\": 1583976155173\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"1CE1B2E6-C682-4241-9399-95791E7447E5\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000053\",\n" +
                "            \"hsicrmEntrytime\": 1583976160640\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"4B0C9005-A8A2-421D-BC4B-9BDAC3F5ABCB\",\n" +
                "            \"hsicrmContractname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000035\",\n" +
                "            \"hsicrmEntrytime\": 1583975984753\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"A8A4C75E-1391-4C62-A1AC-9BDC64B07F58\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1593705599000,\n" +
                "            \"hsicrm_starttime\": 1593576825000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"测试111\",\n" +
                "            \"hsicrmContractno\": \"HT0000002332\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"全流程测试22\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1593576810477\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"34A398AA-395C-4F71-85C4-9C7D92BF21F0\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584892799000,\n" +
                "            \"hsicrm_starttime\": 1584586332000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000065\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976256173\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C95D00C5-73A6-41F1-AB64-9E7137C4AE9B\",\n" +
                "            \"hsicrmContractname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"热水器自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000015\",\n" +
                "            \"hsicrmEntrytime\": 1583975788017\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"690878C4-E2D4-4C63-A7A7-A011DC4D7FF0\",\n" +
                "            \"hsicrmContractname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000034\",\n" +
                "            \"hsicrmEntrytime\": 1583975981750\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"EC99FE0F-5EFB-4EF9-BE82-A02CD7A8B4ED\",\n" +
                "            \"hsicrmContractname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"热水器售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000016\",\n" +
                "            \"hsicrmEntrytime\": 1583975831647\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"D4480D2C-42EF-4730-8537-A13438331DB7\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1582556400000,\n" +
                "            \"hsicrm_starttime\": 1582473600000,\n" +
                "            \"hsicrmAttribute4\": \"已公示\",\n" +
                "            \"hsicrmPmname\": \"测试\",\n" +
                "            \"hsicrmContractno\": \"HTTEST000004\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"工程合同测试4\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmEntrytime\": 1581990598377\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"B438DEE8-F32C-494C-B2BE-A6913E435AED\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590076799000,\n" +
                "            \"hsicrm_starttime\": 1590045377000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000045\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"波轮售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976076587\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"DBD8ABDF-9DAA-490C-B943-A6DF40E78D45\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585065599000,\n" +
                "            \"hsicrm_starttime\": 1584955427000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000024\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975892940\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"58F67A09-9F39-4233-850B-A74F47DD29EF\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590940799000,\n" +
                "            \"hsicrm_starttime\": 1590054035000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000057\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976205807\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"522DAEDC-C765-4120-8D26-A887681EC026\",\n" +
                "            \"hsicrmContractname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000021\",\n" +
                "            \"hsicrmEntrytime\": 1583975883863\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"D617DCCD-2FC5-456C-86C8-B661F29C8830\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584115199000,\n" +
                "            \"hsicrm_starttime\": 1584028800000,\n" +
                "            \"hsicrmAttribute4\": \"待发布\",\n" +
                "            \"hsicrmPmname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000061\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"吸油烟机售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976244550\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"B59F6609-0966-47DC-95E2-BCEE26FA1C36\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590076799000,\n" +
                "            \"hsicrm_starttime\": 1590055043000,\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种 + 商用\",\n" +
                "            \"hsicrmContractno\": \"HT00001666\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"特种 + 商用\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583394694137\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"081A0BB7-A5A8-4AF3-9381-BDF2BFF71D95\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585065599000,\n" +
                "            \"hsicrm_starttime\": 1584948653000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000027\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975927887\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"A598C56E-61E6-4ECB-96A2-BF1A28116B67\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584028800000,\n" +
                "            \"hsicrm_starttime\": 1584028800000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"吸油烟机自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000070\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"吸油烟机自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976303783\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"54E760C6-6304-44F6-9098-C13DC36C0903\",\n" +
                "            \"hsicrmContractname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000006\",\n" +
                "            \"hsicrmEntrytime\": 1583975691780\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"D05E7A9A-6067-4A20-8B7B-C418307CB949\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1590854399000,\n" +
                "            \"hsicrm_starttime\": 1590119036000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000058\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583976209390\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"D3BD4C6A-0332-48B4-820E-C748BFF5C50E\",\n" +
                "            \"hsicrmContractname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000033\",\n" +
                "            \"hsicrmEntrytime\": 1583975978087\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"1F9F13ED-2709-4064-BA98-C7896C960293\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000055\",\n" +
                "            \"hsicrmEntrytime\": 1583976167510\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"5AC7665F-6D57-4138-8552-CAB4E76A5228\",\n" +
                "            \"hsicrmContractname\": \"全流程测试\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"测试111\",\n" +
                "            \"hsicrmContractno\": \"HT00000001\",\n" +
                "            \"hsicrmEntrytime\": 1583291320107\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"宁波欧琳厨具有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"7EB81946-6A76-42FC-BF28-CB26B40584BB\",\n" +
                "            \"hsicrmContractname\": \"HCC对接测试1\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmPmname\": \"王姝琪\",\n" +
                "            \"hsicrmPaymentterms\": 100000005,\n" +
                "            \"hsicrmContractno\": \"HCC对接测试1_01\",\n" +
                "            \"hsicrmIsbid\": true,\n" +
                "            \"hsicrmEntrytime\": 1581482871893\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"F308F579-9AEC-4CC2-AFE4-CCC0F7AB473B\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1581696000000,\n" +
                "            \"hsicrm_starttime\": 1581609600000,\n" +
                "            \"hsicrmAttribute4\": \"已公示\",\n" +
                "            \"hsicrmPmname\": \"测试\",\n" +
                "            \"hsicrmContractno\": \"HTTEST000001\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"工程合同测试1\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmIndustryname\": \"电热\",\n" +
                "            \"hsicrmIsbid\": true,\n" +
                "            \"hsicrmEntrytime\": 1581647526547\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"D2F9DF86-443D-4CFE-9E24-D33C8368F944\",\n" +
                "            \"hsicrmContractname\": \"波轮\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮\",\n" +
                "            \"hsicrmContractno\": \"HT00000500\",\n" +
                "            \"hsicrmEntrytime\": 1583390406030\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"E6372B4F-D78A-4F00-BF91-D3C8D5DA4B87\",\n" +
                "            \"hsicrmContractname\": \"波轮售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000044\",\n" +
                "            \"hsicrmEntrytime\": 1583976073273\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"1B6DD016-D91F-4C81-BCB2-D9E5FB9BAFA5\",\n" +
                "            \"hsicrmContractname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000032\",\n" +
                "            \"hsicrmEntrytime\": 1583975974230\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"8497D35D-2D84-4893-AF52-DDEBF1D71EBA\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584806399000,\n" +
                "            \"hsicrm_starttime\": 1584679133000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000030\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"平板电视自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975939500\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"5976451F-56F1-49C3-9F17-E26DD186EABA\",\n" +
                "            \"hsicrmContractname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000040\",\n" +
                "            \"hsicrmEntrytime\": 1583976032007\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"299E07BE-59D3-457F-B017-E2DB88B0E229\",\n" +
                "            \"hsicrmContractname\": \"吸油烟机\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"吸油烟机\",\n" +
                "            \"hsicrmContractno\": \"HT00000700\",\n" +
                "            \"hsicrmEntrytime\": 1583390546260\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"675E41AF-DB59-4627-83A0-E2DBB6B20054\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1585584000000,\n" +
                "            \"hsicrm_starttime\": 1583078400000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"测试5\",\n" +
                "            \"hsicrmContractno\": \"HTTEST000006\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"工程合同测试6\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1582168673327\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"C5E71477-0B74-40EA-914A-E7D40F01AB69\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1583989200000,\n" +
                "            \"hsicrm_starttime\": 1583942400000,\n" +
                "            \"hsicrmAttribute4\": \"审批中\",\n" +
                "            \"hsicrmPmname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000003\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"家用空调售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmEntrytime\": 1583975682897\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"8D225405-6407-47F1-A71F-EC6FF3BD2E3E\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000052\",\n" +
                "            \"hsicrmEntrytime\": 1583976157683\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"FFF1AA54-4EA7-40C9-9422-ED11CF1504F8\",\n" +
                "            \"hsicrmContractname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"平板电视售后竞标\",\n" +
                "            \"hsicrmContractno\": \"HT10000022\",\n" +
                "            \"hsicrmEntrytime\": 1583975887280\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"3B4D3A08-3681-4EFD-AD8A-F5DDD81EAF26\",\n" +
                "            \"hsicrmContractname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"商用空调售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000037\",\n" +
                "            \"hsicrmEntrytime\": 1583976019580\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"BA5DEFCB-9257-4FFA-B940-F7D765DF1623\",\n" +
                "            \"hsicrmContractname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"特种冰箱自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000054\",\n" +
                "            \"hsicrmEntrytime\": 1583976164207\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"2F62527F-BD95-46E3-A793-FB8FBC56C062\",\n" +
                "            \"hsicrmContractname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmAttribute4\": \"已接入\",\n" +
                "            \"hsicrmPmname\": \"波轮自卖自安\",\n" +
                "            \"hsicrmContractno\": \"HT10000048\",\n" +
                "            \"hsicrmEntrytime\": 1583976119330\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"76C6397E-E76D-42B2-9451-FCE68F4EE7A9\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1584374399000,\n" +
                "            \"hsicrm_starttime\": 1584365991000,\n" +
                "            \"hsicrmAttribute4\": \"已公示\",\n" +
                "            \"hsicrmPmname\": \"波轮售后招标\",\n" +
                "            \"hsicrmContractno\": \"HT10000041\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"波轮售后招标\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmRegionname\": \"青岛市场服务小微\",\n" +
                "            \"hsicrmIsbid\": true,\n" +
                "            \"hsicrmEntrytime\": 1583976063667\n" +
                "        },\n" +
                "        {\n" +
                "            \"hsicrmPartya\": \"中车有限公司\",\n" +
                "            \"hsicrmWoProjectcontractid\": \"3FA1FC86-00F9-40FA-8C53-FD38B0B4697A\",\n" +
                "            \"hsicrmRegioncode\": \"HR13\",\n" +
                "            \"hsicrm_endtime\": 1582646400000,\n" +
                "            \"hsicrm_starttime\": 1582646400000,\n" +
                "            \"hsicrmAttribute4\": \"无人竞标\",\n" +
                "            \"hsicrmPmname\": \"测试\",\n" +
                "            \"hsicrmContractno\": \"HTTEST000003\",\n" +
                "            \"hsicrmDesc\": \"山东省青岛市\",\n" +
                "            \"hsicrmContractname\": \"工程合同测试3\",\n" +
                "            \"hsicrmStroageLocation\": \"WO1\",\n" +
                "            \"hsicrmPmtel\": \"18842331616\",\n" +
                "            \"hsicrmEntrytime\": 1581990590123\n" +
                "        }\n" +
                "    ],\n" +
                "    \"error\": null\n" +
                "}";

        JSONObject rd = (JSONObject) JSON.parse(jsonStr);

        System.out.println("完成");

    }

}
