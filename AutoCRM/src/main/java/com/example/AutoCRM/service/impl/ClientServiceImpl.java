package com.example.AutoCRM.service.impl;

import com.example.AutoCRM.dto.client.ClientResponseDto;
import com.example.AutoCRM.model.Client;
import com.example.AutoCRM.repository.ClientRepository;
import com.example.AutoCRM.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public List<ClientResponseDto> getAllClients() {
        return clientRepository.findAll().stream()
                .map(Client::modelToDto).toList();
    }

    public
}
