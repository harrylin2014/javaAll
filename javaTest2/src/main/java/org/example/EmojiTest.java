package org.example;

import cn.hutool.extra.emoji.EmojiUtil;

/**
 * @author lxl
 * @date 2021/1/20 16:41
 */
public class EmojiTest {
    public static void main(String[] args) {
        System.out.println(EmojiUtil.containsEmoji("test你好这个问题怎么样;fdfdf"));
    }
}
