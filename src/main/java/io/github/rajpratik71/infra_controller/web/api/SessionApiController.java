package io.github.rajpratik71.infra_controller.web.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
@Controller
@RequestMapping("${openapi.infra-controller.base-path:/v1.41}")
public class SessionApiController implements SessionApi {

    private final SessionApiDelegate delegate;

    public SessionApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) SessionApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new SessionApiDelegate() {});
    }

    @Override
    public SessionApiDelegate getDelegate() {
        return delegate;
    }

}
