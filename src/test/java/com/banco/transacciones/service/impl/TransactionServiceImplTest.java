package com.banco.transacciones.service.impl;


import com.banco.transacciones.model.Account;
import com.banco.transacciones.model.AccountType;
import com.banco.transacciones.model.Transaction;
import com.banco.transacciones.model.TransactionType;
import com.banco.transacciones.repository.AccountRepository;
import com.banco.transacciones.repository.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TransactionServiceImplTest {

    @Mock
    private TransactionRepository transactionRepository;

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransactionServiceImpl transactionService;

    @Test
    public void createDeposit() {
        Account account = new Account("1", "123456789", 100.0, AccountType.AHORROS, "clienteId1");
        Transaction transaction = new Transaction("1", TransactionType.DEPOSITO, 50.0, null, "123456789", null);

        when(accountRepository.findByNumeroCuenta("123456789")).thenReturn(Mono.just(account));
        when(accountRepository.save(account)).thenReturn(Mono.just(account));
        when(transactionRepository.save(transaction)).thenReturn(Mono.just(transaction));

        Mono<Transaction> result = transactionService.createDeposit(transaction);

        StepVerifier.create(result)
                .expectNext(transaction)
                .verifyComplete();

        verify(accountRepository, times(1)).findByNumeroCuenta("123456789");
        verify(accountRepository, times(1)).save(account);
        verify(transactionRepository, times(1)).save(transaction);
    }
}
