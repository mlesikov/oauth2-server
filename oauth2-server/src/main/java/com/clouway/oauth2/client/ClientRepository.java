package com.clouway.oauth2.client;

import com.google.common.base.Optional;

/**
 * @author Mihail Lesikov (mlesikov@gmail.com)
 */
public interface ClientRepository {

  void save(Client client);

  Optional<Client> findById(String id);
}