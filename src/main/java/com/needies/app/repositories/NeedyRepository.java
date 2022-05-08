package com.needies.app.repositories;

import com.needies.app.models.Needy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NeedyRepository extends JpaRepository<Needy, UUID> {
}
