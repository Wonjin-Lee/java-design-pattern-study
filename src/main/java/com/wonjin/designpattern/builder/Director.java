package com.wonjin.designpattern.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 문서를 구축한다.
     */
    public void constructor() {
        builder.makeTitle("술과 음식 조합");
        builder.makeString("맥주");
        builder.makeItems(new String[] {
                "치킨",
                "피자"
        });
        builder.makeString("소주");
        builder.makeItems(new String[] {
                "삼겹살",
                "오뎅탕"
        });
        builder.close();
    }
}
