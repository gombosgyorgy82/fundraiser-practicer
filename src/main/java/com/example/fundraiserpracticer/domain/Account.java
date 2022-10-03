package com.example.fundraiserpracticer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "goal")
    private String goal;

    @Column(name = "fund")
    private Integer fund;

    @Column(name = "balance")
    private Integer balance;

    @OneToMany(mappedBy = "target")
    private List<Transfer> incomingTransfers;

    @OneToMany(mappedBy = "source")
    private List<Transfer> outgoingTransfers;


    public Long getId() {
        return id;
    }


    public String getUsername() {
        return username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
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

    public Integer getFund() {
        return fund;
    }

    public void setFund(Integer fund) {
        this.fund = fund;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public List<Transfer> getIncomingTransfers() {
        return incomingTransfers;
    }

    public void setIncomingTransfers(List<Transfer> incomingTransfers) {
        this.incomingTransfers = incomingTransfers;
    }

    public List<Transfer> getOutgoingTransfers() {
        return outgoingTransfers;
    }

    public void setOutgoingTransfers(List<Transfer> outgoingTransfers) {
        this.outgoingTransfers = outgoingTransfers;
    }
}
