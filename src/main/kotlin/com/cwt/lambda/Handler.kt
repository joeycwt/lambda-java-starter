package com.cwt.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import org.slf4j.LoggerFactory

/**
 * Created by U035JXT on 5/23/2017.
 */
class Handler : RequestHandler<String, String> {
    private val LOG = LoggerFactory.getLogger(javaClass)


    override fun handleRequest(input: String, context: Context): String {
        LOG.debug("hello")
        return "my input=$input"
    }
}