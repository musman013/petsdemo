package com.nfinity.fastcode.petsdemo.domain.owners;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import javax.validation.constraints.Positive;
import com.nfinity.fastcode.petsdemo.domain.model.OwnersEntity;
import com.nfinity.fastcode.petsdemo.domain.model.PetsEntity;

public interface IOwnersManager {
    // CRUD Operations
    OwnersEntity create(OwnersEntity owners);

    void delete(OwnersEntity owners);

    OwnersEntity update(OwnersEntity owners);

    OwnersEntity findById(Integer id);
	
    Page<OwnersEntity> findAll(Predicate predicate, Pageable pageable);
}
