package com.study.backendapi;

import com.study.backendapi.RegionData;
import com.study.backendapi.RegionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RegionDataRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new RegionData("강원도", "강릉시", 979, 32.3));
        repository.save(new RegionData("강원도", "동해시", 1032, 21.9));
        repository.save(new RegionData("강원도", "속초시", 1375, 15.8));
        repository.save(new RegionData("경기도", "시흥시", 1223, 11.8));
        repository.save(new RegionData("경기도", "안산시", 30, 0.7));
        repository.save(new RegionData("경기도", "화성시", 120, 1.5));
        repository.save(new RegionData("경상남도", "거제시", 3987, 95.2));
        repository.save(new RegionData("경상남도", "고성군", 2835, 40.3));
        repository.save(new RegionData("경상남도", "남해군", 198, 18.6));
        repository.save(new RegionData("경상남도", "사천시", 310, 10.3));
        repository.save(new RegionData("경상남도", "창원시", 1154, 18.3));
        repository.save(new RegionData("경상남도", "통영시", 106943, 696.5));
        repository.save(new RegionData("경상북도", "영덕군", 574, 7.4));
        repository.save(new RegionData("경상북도", "울릉군", 1615, 186.7));
        repository.save(new RegionData("경상북도", "울진군", 731, 13.0));
        repository.save(new RegionData("경상북도", "포항시", 4241, 72.8));
        repository.save(new RegionData("부산광역시", "부산시", 10838, 103.7));
        repository.save(new RegionData("울산광역시", "울산시", 3684, 41.9));
        repository.save(new RegionData("울산광역시", "울주군", 1619, 61.5));
        repository.save(new RegionData("인천광역시", "강화군", 656, 29.3));
        repository.save(new RegionData("인천광역시", "인천시", 1130, 52.9));
        repository.save(new RegionData("전라남도", "고흥군", 934, 61.9));
        repository.save(new RegionData("전라남도", "신안군", 9312, 1296.9));
        repository.save(new RegionData("전라남도", "여수시", 13731, 423.8));
        repository.save(new RegionData("전라남도", "영광군", 156, 24.4));
        repository.save(new RegionData("전라남도", "완도군", 2998, 190.3));
        repository.save(new RegionData("전라남도", "진도군", 913, 143.9));
        repository.save(new RegionData("전라남도", "해남군", 801, 135.8));
        repository.save(new RegionData("전라북도", "고창군", 245, 26.9));
        repository.save(new RegionData("전라북도", "군산시", 48, 0.7));
        repository.save(new RegionData("전라북도", "부안군", 186, 86.5));
        repository.save(new RegionData("제주특별자치도", "서귀포시", 1671, 43.0));
        repository.save(new RegionData("제주특별자치도", "제주시", 1930, 83.5));
        repository.save(new RegionData("충청남도", "당진시", 108, 1.4));
        repository.save(new RegionData("충청남도", "보령시", 440, 66.3));
        repository.save(new RegionData("충청남도", "서천군", 242, 96.5));
        repository.save(new RegionData("충청남도", "태안군", 3385, 125.2));
    }
}
