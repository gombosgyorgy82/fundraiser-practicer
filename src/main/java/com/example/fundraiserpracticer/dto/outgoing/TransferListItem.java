package com.example.fundraiserpracticer.dto.outgoing;

import com.example.fundraiserpracticer.domain.Transfer;

import java.time.LocalDateTime;

public class TransferListItem {



    private Long id;

    private String source;

    private String target;

    private Long amount;

    private LocalDateTime timestamp;

    public TransferListItem(Transfer transfer) {
        this.id = transfer.getId();
        this.source = transfer.getSource().getUsername();
        this.target = transfer.getTarget().getGoal();
        this.amount = transfer.getAmount();
        this.timestamp = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }

    public Long getAmount() {
        return amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
