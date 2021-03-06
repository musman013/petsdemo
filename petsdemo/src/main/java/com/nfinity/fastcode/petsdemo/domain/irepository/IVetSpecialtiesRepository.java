package com.nfinity.fastcode.petsdemo.domain.irepository;

import com.nfinity.fastcode.petsdemo.domain.model.VetSpecialtiesId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;
import com.nfinity.fastcode.petsdemo.domain.model.VetSpecialtiesEntity;
import org.javers.spring.annotation.JaversSpringDataAuditable;

@JaversSpringDataAuditable
@RepositoryRestResource(collectionResourceRel = "vetSpecialties", path = "vetSpecialties")
public interface IVetSpecialtiesRepository extends JpaRepository<VetSpecialtiesEntity, VetSpecialtiesId>,QuerydslPredicateExecutor<VetSpecialtiesEntity> {

}
