package com.customermanagementsystem.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDataRepository extends CrudRepository<ClientData,Long> {


}
