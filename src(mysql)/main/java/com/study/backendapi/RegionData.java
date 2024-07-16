package com.study.backendapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RegionData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String province;
    private String city;
    private int count;
    private double weight;

    // 기본 생성자
    public RegionData() {
    }

    // 생성자
    public RegionData(String province, String city, int count, double weight) {
        this.province = province;
        this.city = city;
        this.count = count;
        this.weight = weight;
    }


}
