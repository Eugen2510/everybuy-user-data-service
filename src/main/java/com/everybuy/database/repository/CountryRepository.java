package com.everybuy.database.repository;

import com.everybuy.database.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
CountryRepository extends JpaRepository<Country, Long> {
}
