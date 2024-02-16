package com.adobe.aem.support.xf.rewriter;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.xf.ExperienceFragmentLinkRewriterProvider;
import com.adobe.cq.xf.ExperienceFragmentVariation;

@Component(service = ExperienceFragmentLinkRewriterProvider.class)
public class XFLinkRewriterImpl implements ExperienceFragmentLinkRewriterProvider {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public int getPriority() {
        return 1000;
    }

    @Override
    public String rewriteLink(String arg0, String arg1, String arg2) {
        logger.info("We are about to rewrite the following link {}", arg0);
        String result = "/home/always.html";
        logger.info("Rewrote the link to be set to {}", result);

        return result;
    }

    @Override
    public boolean shouldRewrite(ExperienceFragmentVariation arg0) {
        return true;
    }
    
}
