package com.fmy.velocity.directive;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.velocity.context.InternalContextAdapter;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.apache.velocity.runtime.directive.Directive;
import org.apache.velocity.runtime.parser.node.Node;

import java.io.IOException;
import java.io.Writer;

public class EscapeHtmlDirective extends Directive {

    @Override
    public String getName() {
        return "EscapeHtml";
    }

    @Override
    public int getType() {
        return LINE;
    }

    @Override
    public boolean render(InternalContextAdapter internalContextAdapter, Writer writer, Node node)
            throws IOException, ResourceNotFoundException, ParseErrorException, MethodInvocationException {

        String outString = "";

        Node tmpNode = node.jjtGetChild(0);
        if (tmpNode != null) {
            Object tmpObject = tmpNode.value(internalContextAdapter);
            if (tmpObject != null) {
                outString = StringEscapeUtils.escapeHtml(tmpObject.toString());
            }
        }

        // 输出结果
        writer.write(outString);

        return true;
    }
}
