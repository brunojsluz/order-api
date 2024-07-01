package com.luzlabs.order_api.controller

import com.luzlabs.order_api.controller.resource.ErrResponse
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorHandleController {

    @ExceptionHandler(Exception::class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    fun handleServerError(ex: Exception, request: HttpServletRequest): ErrResponse {
        return ErrResponse(
            status = HttpStatus.INTERNAL_SERVER_ERROR.value(),
            error = HttpStatus.INTERNAL_SERVER_ERROR.name,
            message = ex.message ?: "Internal server error",
            path = request.servletPath
        )
    }


    @ExceptionHandler(MethodArgumentNotValidException::class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    fun handleBeanValidationError(ex: MethodArgumentNotValidException, request: HttpServletRequest): ErrResponse {
        val errors = HashMap<String, String?>()
        ex.bindingResult.fieldErrors.forEach { e ->
            errors.put(e.field, e.defaultMessage)
        }
        return ErrResponse(
            status = HttpStatus.BAD_REQUEST.value(),
            error = HttpStatus.BAD_REQUEST.name,
            message = errors.toString(),
            path = request.servletPath
        )
    }
}