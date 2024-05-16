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
public class ClientViewModel {

    private Long id;
    private String name;
    private String email;
    private String phone;

    public String getPhone() {
        return StringUtils.formatPhone((phone));
    }

    public static ClientViewModel of(Client client) {
        // return new ClientViewModel(
        // client.getId(),
        // client.getName(),
        // client.getEmail(),
        // client.getPhone());

        return ClientViewModel.builder()
        .id(client.getId())
        .name(client.getName())
        .email(client.getEmail())
        .phone(client.getPhone())
        .build();
    }

}
