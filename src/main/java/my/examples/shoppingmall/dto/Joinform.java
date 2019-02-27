package my.examples.shoppingmall.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Joinform {
    @NotBlank(message="이름을 입력해주세요")
    private String name;
    @NotBlank(message="닉네임을 입력해주세요")
    @Size(min=4, max=12)
    private String nickname;
    @NotBlank(message="이메일을 작성해주세요")
    @Email(message="메일의 양식을 잘 지켜주세요")
    @Size(min=4, max=255)
    private String email;
    @NotBlank(message="비밀번호를 입력해주세요")
    @Size(min=4, max=12)
    private String passwd;
    @NotBlank(message="비밀번호 확인을 입력해주세요")
    @Size(min=4, max=12)
    private String passwd2;
}
