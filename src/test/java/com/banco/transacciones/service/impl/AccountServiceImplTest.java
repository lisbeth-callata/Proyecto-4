package com.banco.transacciones.service.impl;

import com.banco.transacciones.model.Account;
import com.banco.transacciones.model.AccountType;
import com.banco.transacciones.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceImplTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountServiceImpl accountService;

    @Test
    public void createAccount() {
        Account account = new Account("1", "123456789", 100.0, AccountType.AHORROS, "clienteId1");

        when(accountRepository.save(account)).thenReturn(Mono.just(account));

        Mono<Account> result = accountService.createAccount(account);

        StepVerifier.create(result)
                .expectNext(account)
                .verifyComplete();

        verify(accountRepository, times(1)).save(account);
    }

    @Test
    public void getAccount() {
        Account account = new Account("1", "123456789", 100.0, AccountType.AHORROS, "clienteId1");

        when(accountRepository.findById("1")).thenReturn(Mono.just(account));

        Mono<Account> result = accountService.getAccount("1");

        StepVerifier.create(result)
                .expectNext(account)
                .verifyComplete();

        verify(accountRepository, times(1)).findById("1");
    }
}
