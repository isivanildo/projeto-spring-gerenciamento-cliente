package br.com.belemtech.btprojects.web.client.dtos;

import br.com.belemtech.btprojects.core.models.Client;
import br.com.belemtech.btprojects.core.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {

    private Long id;
    private String name;
    private String email;
    private String phone;

    public String cleanedPhone() {
        return phone.replaceAll("[^0-9]", "");
    }

    public Client toClient() {
        return Client.builder()
        .id(id)
        .name(name)
        .email(email)
        .phone(StringUtils.cleanPhone(phone))
        .build();
    }

    public static ClientForm of(Client client) {
        return ClientForm.builder()
        .name(client.getName())
        .email(client.getEmail())
        .phone(StringUtils.formatPhone(client.getPhone()))
        .build();
    }

}
