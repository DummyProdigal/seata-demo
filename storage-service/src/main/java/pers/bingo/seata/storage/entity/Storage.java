package pers.bingo.seata.storage.entity;


import lombok.Data;

@Data
public class Storage {

    private Long id;
    private String commodityCode;
    private Long count;

}