package com.nfinity.fastcode.petsdemo.domain.irepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.nfinity.fastcode.petsdemo.domain.model.VisitsEntity; 
import java.util.List;
import com.nfinity.fastcode.petsdemo.domain.model.PetsEntity;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@RepositoryRestResource(collectionResourceRel = "pets", path = "pets")
public interface IPetsRepository extends JpaRepository<PetsEntity, Integer>,QuerydslPredicateExecutor<PetsEntity> {

}
