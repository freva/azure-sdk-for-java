// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.SupportTicketDetailsProperties;
import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.ContactProfile;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.QuotaChangeRequest;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import com.azure.resourcemanager.support.models.SecondaryConsent;
import com.azure.resourcemanager.support.models.ServiceLevelAgreement;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.SupportEngineer;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import com.azure.resourcemanager.support.models.UserConsent;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SupportTicketDetailsPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SupportTicketDetailsProperties model = BinaryData.fromString(
            "{\"supportTicketId\":\"gmtsavjcbpwxqpsr\",\"description\":\"nftguvriuhpr\",\"problemClassificationId\":\"mdyvxqtayriw\",\"problemClassificationDisplayName\":\"oyq\",\"severity\":\"highestcriticalimpact\",\"enrollmentId\":\"rmcqiby\",\"require24X7Response\":true,\"advancedDiagnosticConsent\":\"Yes\",\"problemScopingQuestions\":\"nmefqsgzvahapj\",\"supportPlanId\":\"hpvgqz\",\"contactDetails\":{\"firstName\":\"j\",\"lastName\":\"vxdjzlmwlxkvugf\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"ovawjvzunlu\",\"additionalEmailAddresses\":[\"n\",\"rnxipei\"],\"phoneNumber\":\"jzuaejxdultskzbb\",\"preferredTimeZone\":\"dzumveekg\",\"country\":\"wozuhkf\",\"preferredSupportLanguage\":\"bsjyofdx\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-06-15T07:35:54Z\",\"expirationTime\":\"2021-01-22T23:23:23Z\",\"slaMinutes\":1422945070},\"supportEngineer\":{\"emailAddress\":\"aboekqv\"},\"supportPlanType\":\"lns\",\"supportPlanDisplayName\":\"bxwyjsflhhcaa\",\"title\":\"n\",\"problemStartTime\":\"2021-03-25T19:19:56Z\",\"serviceId\":\"isxyawjoyaqcslyj\",\"serviceDisplayName\":\"iidzyexzne\",\"status\":\"xhnrztfolhb\",\"createdDate\":\"2021-09-08T07:53:31Z\",\"modifiedDate\":\"2021-06-25T15:29:39Z\",\"fileWorkspaceName\":\"aulppggd\",\"isTemporaryTicket\":\"No\",\"technicalTicketDetails\":{\"resourceId\":\"nyiropuhpi\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"gylgqgitxmedjvcs\",\"quotaChangeRequestVersion\":\"n\",\"quotaChangeRequests\":[{\"region\":\"cwzzhxgktr\",\"payload\":\"ucnapkteoellwp\"},{\"region\":\"d\",\"payload\":\"pfqbuaceopzf\"},{\"region\":\"hhuao\",\"payload\":\"pcqeqx\"},{\"region\":\"z\",\"payload\":\"hzxct\"}]},\"secondaryConsent\":[{\"userConsent\":\"Yes\",\"type\":\"moizpos\"},{\"userConsent\":\"Yes\",\"type\":\"cfbu\"},{\"userConsent\":\"No\",\"type\":\"qjhhkxbpv\"}]}")
            .toObject(SupportTicketDetailsProperties.class);
        Assertions.assertEquals("gmtsavjcbpwxqpsr", model.supportTicketId());
        Assertions.assertEquals("nftguvriuhpr", model.description());
        Assertions.assertEquals("mdyvxqtayriw", model.problemClassificationId());
        Assertions.assertEquals(SeverityLevel.HIGHESTCRITICALIMPACT, model.severity());
        Assertions.assertEquals("rmcqiby", model.enrollmentId());
        Assertions.assertEquals(true, model.require24X7Response());
        Assertions.assertEquals(Consent.YES, model.advancedDiagnosticConsent());
        Assertions.assertEquals("nmefqsgzvahapj", model.problemScopingQuestions());
        Assertions.assertEquals("hpvgqz", model.supportPlanId());
        Assertions.assertEquals("j", model.contactDetails().firstName());
        Assertions.assertEquals("vxdjzlmwlxkvugf", model.contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL, model.contactDetails().preferredContactMethod());
        Assertions.assertEquals("ovawjvzunlu", model.contactDetails().primaryEmailAddress());
        Assertions.assertEquals("n", model.contactDetails().additionalEmailAddresses().get(0));
        Assertions.assertEquals("jzuaejxdultskzbb", model.contactDetails().phoneNumber());
        Assertions.assertEquals("dzumveekg", model.contactDetails().preferredTimeZone());
        Assertions.assertEquals("wozuhkf", model.contactDetails().country());
        Assertions.assertEquals("bsjyofdx", model.contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("n", model.title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-25T19:19:56Z"), model.problemStartTime());
        Assertions.assertEquals("isxyawjoyaqcslyj", model.serviceId());
        Assertions.assertEquals("aulppggd", model.fileWorkspaceName());
        Assertions.assertEquals("nyiropuhpi", model.technicalTicketDetails().resourceId());
        Assertions.assertEquals("gylgqgitxmedjvcs", model.quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("n", model.quotaTicketDetails().quotaChangeRequestVersion());
        Assertions.assertEquals("cwzzhxgktr", model.quotaTicketDetails().quotaChangeRequests().get(0).region());
        Assertions.assertEquals("ucnapkteoellwp", model.quotaTicketDetails().quotaChangeRequests().get(0).payload());
        Assertions.assertEquals(UserConsent.YES, model.secondaryConsent().get(0).userConsent());
        Assertions.assertEquals("moizpos", model.secondaryConsent().get(0).type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SupportTicketDetailsProperties model = new SupportTicketDetailsProperties()
            .withSupportTicketId("gmtsavjcbpwxqpsr").withDescription("nftguvriuhpr")
            .withProblemClassificationId("mdyvxqtayriw").withSeverity(SeverityLevel.HIGHESTCRITICALIMPACT)
            .withEnrollmentId("rmcqiby").withRequire24X7Response(true).withAdvancedDiagnosticConsent(Consent.YES)
            .withProblemScopingQuestions("nmefqsgzvahapj").withSupportPlanId("hpvgqz")
            .withContactDetails(new ContactProfile().withFirstName("j").withLastName("vxdjzlmwlxkvugf")
                .withPreferredContactMethod(PreferredContactMethod.EMAIL).withPrimaryEmailAddress("ovawjvzunlu")
                .withAdditionalEmailAddresses(Arrays.asList("n", "rnxipei")).withPhoneNumber("jzuaejxdultskzbb")
                .withPreferredTimeZone("dzumveekg").withCountry("wozuhkf").withPreferredSupportLanguage("bsjyofdx"))
            .withServiceLevelAgreement(new ServiceLevelAgreement()).withSupportEngineer(new SupportEngineer())
            .withTitle("n").withProblemStartTime(OffsetDateTime.parse("2021-03-25T19:19:56Z"))
            .withServiceId("isxyawjoyaqcslyj").withFileWorkspaceName("aulppggd")
            .withTechnicalTicketDetails(new TechnicalTicketDetails().withResourceId("nyiropuhpi"))
            .withQuotaTicketDetails(new QuotaTicketDetails().withQuotaChangeRequestSubType("gylgqgitxmedjvcs")
                .withQuotaChangeRequestVersion("n").withQuotaChangeRequests(
                    Arrays.asList(new QuotaChangeRequest().withRegion("cwzzhxgktr").withPayload("ucnapkteoellwp"),
                        new QuotaChangeRequest().withRegion("d").withPayload("pfqbuaceopzf"),
                        new QuotaChangeRequest().withRegion("hhuao").withPayload("pcqeqx"),
                        new QuotaChangeRequest().withRegion("z").withPayload("hzxct"))))
            .withSecondaryConsent(
                Arrays.asList(new SecondaryConsent().withUserConsent(UserConsent.YES).withType("moizpos"),
                    new SecondaryConsent().withUserConsent(UserConsent.YES).withType("cfbu"),
                    new SecondaryConsent().withUserConsent(UserConsent.NO).withType("qjhhkxbpv")));
        model = BinaryData.fromObject(model).toObject(SupportTicketDetailsProperties.class);
        Assertions.assertEquals("gmtsavjcbpwxqpsr", model.supportTicketId());
        Assertions.assertEquals("nftguvriuhpr", model.description());
        Assertions.assertEquals("mdyvxqtayriw", model.problemClassificationId());
        Assertions.assertEquals(SeverityLevel.HIGHESTCRITICALIMPACT, model.severity());
        Assertions.assertEquals("rmcqiby", model.enrollmentId());
        Assertions.assertEquals(true, model.require24X7Response());
        Assertions.assertEquals(Consent.YES, model.advancedDiagnosticConsent());
        Assertions.assertEquals("nmefqsgzvahapj", model.problemScopingQuestions());
        Assertions.assertEquals("hpvgqz", model.supportPlanId());
        Assertions.assertEquals("j", model.contactDetails().firstName());
        Assertions.assertEquals("vxdjzlmwlxkvugf", model.contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL, model.contactDetails().preferredContactMethod());
        Assertions.assertEquals("ovawjvzunlu", model.contactDetails().primaryEmailAddress());
        Assertions.assertEquals("n", model.contactDetails().additionalEmailAddresses().get(0));
        Assertions.assertEquals("jzuaejxdultskzbb", model.contactDetails().phoneNumber());
        Assertions.assertEquals("dzumveekg", model.contactDetails().preferredTimeZone());
        Assertions.assertEquals("wozuhkf", model.contactDetails().country());
        Assertions.assertEquals("bsjyofdx", model.contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("n", model.title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-25T19:19:56Z"), model.problemStartTime());
        Assertions.assertEquals("isxyawjoyaqcslyj", model.serviceId());
        Assertions.assertEquals("aulppggd", model.fileWorkspaceName());
        Assertions.assertEquals("nyiropuhpi", model.technicalTicketDetails().resourceId());
        Assertions.assertEquals("gylgqgitxmedjvcs", model.quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("n", model.quotaTicketDetails().quotaChangeRequestVersion());
        Assertions.assertEquals("cwzzhxgktr", model.quotaTicketDetails().quotaChangeRequests().get(0).region());
        Assertions.assertEquals("ucnapkteoellwp", model.quotaTicketDetails().quotaChangeRequests().get(0).payload());
        Assertions.assertEquals(UserConsent.YES, model.secondaryConsent().get(0).userConsent());
        Assertions.assertEquals("moizpos", model.secondaryConsent().get(0).type());
    }
}
