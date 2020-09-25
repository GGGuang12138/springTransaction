package com.gg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Creat by GG
 * Date on 2020/9/23  10:04 下午
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int id;
    private String accountName;
    private String user;
}
