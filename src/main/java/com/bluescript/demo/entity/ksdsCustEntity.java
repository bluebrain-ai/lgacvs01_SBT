package com.bluescript.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "KSDSCUST")
@Data
// @Component
@AllArgsConstructor
@NoArgsConstructor
// Schema : CUSTOMER
public class ksdsCustEntity {

    @Id
    @Column(name = "CUSTOMERNUMBER")
    private long customerNum;
    @Column(name = "CUSTOMERDATA")
    private String customerData;
}
