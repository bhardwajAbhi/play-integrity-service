package com.mb.playintegrityservice.api.controller;

import com.mb.playintegrityservice.api.request.ApiPlayIntegrityTokenResult;
import com.mb.playintegrityservice.service.PlayIntegrityService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/validations/play-integrity")
public class PlayIntegrityController {

    private final PlayIntegrityService playIntegrityService;

    /**
     * Create nonce for Play Integrity
     **/
    @ApiOperation(value = "Create nonce for Play Integrity")
    @GetMapping("/nonce")
    public Map<String, String> createNonce() {
        log.info("Received a request to create nonce. createNonce");
        return playIntegrityService.createNonce();
    }

    /**
     * Verify Play Integrity token result.
     *
     * @param tokenResult to verify Play Integrity token result.
     */
    @ApiOperation(value = "Verify Play Integrity token result")
    @PostMapping(value = "/verify-token")
    public Map<String, Object> verifyToken(@RequestBody ApiPlayIntegrityTokenResult tokenResult) {
        log.info("Received a request to verify Play Integrity token result. verifyToken - ApiPlayIntegrityTokenResult:{}", tokenResult);
        return playIntegrityService.verifyToken(tokenResult);
    }
}
