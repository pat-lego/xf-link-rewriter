# XF Link Rewriter

The XF Link Rewriter uses the ExperienceFragmentLinkRewriterProvider class to perform XF URL rewriting

## Known Issues 

The com.adobe.cq.xf.impl.adobetarget.TargetHtmlTransformer incorrectly performs an Sling Adaptation from Page to XF Experience Fragment causing an NPE to occur.

The fix is [here](https://jira.corp.adobe.com/browse/CQ-4356511) and once included in the main line will allow for the ExperienceFragmentLinkRewriterProvider implementations to work.

# How to build 

`mvn clean install`

