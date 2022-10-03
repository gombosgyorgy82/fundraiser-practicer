package com.example.fundraiserpracticer.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transfer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "amount")
    private Long amount;

    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;

    @ManyToOne
    @JoinColumn(name = "source_account_id")
    private Account source;

    @ManyToOne
    @JoinColumn(name = "target_account_id")
    private Account target;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Account getSource() {
        return source;
    }

    public void setSource(Account source) {
        this.source = source;
    }

    public Account getTarget() {
        return target;
    }

    public void setTarget(Account target) {
        this.target = target;
    }
}
