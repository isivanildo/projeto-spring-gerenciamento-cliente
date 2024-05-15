package br.com.belemtech.btprojects.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.belemtech.btprojects.core.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
