package com.megazone;


import com.megazone.entity.EduEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {

//	@Autowired eduRepository eduRepository;

    public List<EduEntity> findAll() {
        List<EduEntity> eduEntities = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EduEntity eduEntity = new EduEntity();
            eduEntity.setAge(i);
            eduEntity.setGuid("P_SPRING_API  : " + i);
            eduEntity.setPhone("P_SPRING_API : " + i);
            eduEntity.setId(i);
            eduEntities.add(eduEntity);
        }

        return eduEntities;
    }


}
