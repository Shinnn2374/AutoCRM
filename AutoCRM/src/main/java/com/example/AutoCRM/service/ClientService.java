package com.example.AutoCRM.service;

import com.example.AutoCRM.dto.client.ClientRequestDto;
import com.example.AutoCRM.dto.client.ClientResponseDto;

import java.util.List;

public interface ClientService {

    List<ClientResponseDto> getAllClients();

    ClientResponseDto getClientById(int id);

    ClientResponseDto createClient(ClientRequestDto clientRequestDto);

    ClientResponseDto updateClient(int id, ClientRequestDto clientRequestDto);

    ClientResponseDto deleteClient(int id);
}
