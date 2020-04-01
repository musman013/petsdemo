package com.nfinity.fastcode.petsdemo.application.pets;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import com.nfinity.fastcode.petsdemo.domain.model.TypesEntity;
import com.nfinity.fastcode.petsdemo.domain.model.OwnersEntity;
import com.nfinity.fastcode.petsdemo.application.pets.dto.*;
import com.nfinity.fastcode.petsdemo.domain.model.PetsEntity;

@Mapper(componentModel = "spring")
public interface PetsMapper {

   PetsEntity createPetsInputToPetsEntity(CreatePetsInput petsDto);
   
   @Mappings({ 
   @Mapping(source = "types.id", target = "typeId"),                   
   @Mapping(source = "types.name", target = "typesDescriptiveField"),                    
   @Mapping(source = "owners.id", target = "ownerId"),                   
   @Mapping(source = "owners.firstName", target = "ownersDescriptiveField"),                    
   }) 
   CreatePetsOutput petsEntityToCreatePetsOutput(PetsEntity entity);

   PetsEntity updatePetsInputToPetsEntity(UpdatePetsInput petsDto);

   @Mappings({ 
   @Mapping(source = "types.id", target = "typeId"),                   
   @Mapping(source = "types.name", target = "typesDescriptiveField"),                    
   @Mapping(source = "owners.id", target = "ownerId"),                   
   @Mapping(source = "owners.firstName", target = "ownersDescriptiveField"),                    
   }) 
   UpdatePetsOutput petsEntityToUpdatePetsOutput(PetsEntity entity);

   @Mappings({ 
   @Mapping(source = "types.id", target = "typeId"),                   
   @Mapping(source = "types.name", target = "typesDescriptiveField"),                    
   @Mapping(source = "owners.id", target = "ownerId"),                   
   @Mapping(source = "owners.firstName", target = "ownersDescriptiveField"),                    
   }) 
   FindPetsByIdOutput petsEntityToFindPetsByIdOutput(PetsEntity entity);


   @Mappings({
   @Mapping(source = "types.id", target = "id"),                  
   @Mapping(source = "types.name", target = "name"),                  
   @Mapping(source = "pets.id", target = "petsId"),
   })
   GetTypesOutput typesEntityToGetTypesOutput(TypesEntity types, PetsEntity pets);

   @Mappings({
   @Mapping(source = "owners.id", target = "id"),                  
   @Mapping(source = "pets.id", target = "petsId"),
   })
   GetOwnersOutput ownersEntityToGetOwnersOutput(OwnersEntity owners, PetsEntity pets);

}
