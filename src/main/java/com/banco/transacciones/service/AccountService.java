package com.banco.transacciones.service;

import com.banco.transacciones.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {

    Mono<Account> getAccount(String id);
    Mono<Account> createAccount(Account account);
    Mono<Account> updateAccount(Account account);
    Flux<Account> getAllAccounts();
}
