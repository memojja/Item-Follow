package com.example.model;

import javax.persistence.*;

/**
 * Created by mehmet on 6.10.2016.
 */
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "type",nullable = false)
    private String type;

    @Column(name = "amount")
    private String amount;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Item() {

    }

    public Item(String type, String amount) {
        this.amount = amount;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
