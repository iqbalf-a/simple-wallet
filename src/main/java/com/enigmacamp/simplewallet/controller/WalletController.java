package com.enigmacamp.simplewallet.controller;

import com.enigmacamp.simplewallet.model.response.ErrorResponse;
import com.enigmacamp.simplewallet.model.Wallet;
import com.enigmacamp.simplewallet.model.response.SuccessResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/wallet-payment")
public class WalletController {
    @PostMapping()
    public ResponseEntity payment(@RequestBody Wallet wallet) throws Exception {
        String newTransType = wallet.getTransactionType().toUpperCase();
        UUID uuid = UUID.randomUUID();

        if (!wallet.getCustomerId().equals("123") || !wallet.getTransactionId().equals("123") || !newTransType.equals("PAYMENT")) {
            return ResponseEntity.status(HttpStatus.OK).body(new ErrorResponse("X01", "Transaction type is unknown"));
        }

        return ResponseEntity.status(HttpStatus.OK).body(new SuccessResponse<>("Success payment", uuid.toString()));
    }
}
