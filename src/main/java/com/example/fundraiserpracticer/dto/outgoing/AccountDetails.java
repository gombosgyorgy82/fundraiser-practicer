package com.example.fundraiserpracticer.dto.outgoing;

import com.example.fundraiserpracticer.domain.Account;
import com.example.fundraiserpracticer.domain.Transfer;

import java.util.List;
import java.util.stream.Collectors;

public class AccountDetails {

    private Long id;

    private String username;

    private String goal;

    private Integer balance;

    private Integer funds;

    private List<TransferListItem>incomingTransferList;

    private List<TransferListItem> outgoingTransferList;


    public AccountDetails(Account account) {
        this.id = account.getId();
        this.username = account.getUsername();
        this.goal = account.getGoal();
        this.balance = account.getBalance();
        this.funds = account.getFund();
        this.incomingTransferList = account.getIncomingTransfers().stream().map(TransferListItem::new).collect(Collectors.toList());
        this.outgoingTransferList = account.getOutgoingTransfers().stream().map(TransferListItem::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getFunds() {
        return funds;
    }

    public void setFunds(Integer funds) {
        this.funds = funds;
    }

    public List<TransferListItem> getIncomingTransferList() {
        return incomingTransferList;
    }

    public void setIncomingTransferList(List<TransferListItem> incomingTransferList) {
        this.incomingTransferList = incomingTransferList;
    }

    public List<TransferListItem> getOutgoingTransferList() {
        return outgoingTransferList;
    }

    public void setOutgoingTransferList(List<TransferListItem> outgoingTransferList) {
        this.outgoingTransferList = outgoingTransferList;
    }
}
