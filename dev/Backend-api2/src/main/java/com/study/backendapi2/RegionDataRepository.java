package com.study.backendapi2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RegionDataRepository extends JpaRepository<RegionData, Long> {

    Optional<RegionData> findByProvinceAndCity(String province, String city);

}