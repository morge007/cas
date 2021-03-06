package org.apereo.cas.authentication;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This is {@link OneTimeTokenCredential}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class OneTimeTokenCredential implements Credential {

    private static final long serialVersionUID = -7570600701132111037L;

    private String token;

    @Override
    public String getId() {
        return this.token;
    }
}
