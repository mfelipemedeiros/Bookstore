package com.example.Bookstore.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "stock")
@Table(name = "stock")
@Setter
@Getter
public class StockEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)//Verificar
    // @JoinTable(name ="Stock_Book",
    //             joinColumns = @JoinColumn(name = "id_book"),
    //             inverseJoinColumns = @JoinColumn(name = "Stock_id"))
    // private BookEntity bookEntity;

    private int quantity;

    private int price;

}
