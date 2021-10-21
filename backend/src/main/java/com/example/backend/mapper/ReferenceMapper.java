package com.example.backend.mapper;

import lombok.NonNull;
import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class ReferenceMapper {

    @PersistenceContext
    private EntityManager entityManager;

    @ObjectFactory
    public <T> T map(@TargetType Class<T> type, @NonNull final Long id) {
        return entityManager.getReference(type, id);
    }
}
