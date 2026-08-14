package com.nt.comp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
private String transactionId;
private  int amount;
private String status;

}
