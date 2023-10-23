// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.support.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.support.fluent.models.SupportTicketDetailsInner;
import com.azure.resourcemanager.support.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.support.models.UpdateSupportTicket;

/** An instance of this class provides access to all the operations defined in SupportTicketsClient. */
public interface SupportTicketsClient {
    /**
     * Check the availability of a resource name. This API should be used to check the uniqueness of the name for
     * support ticket creation for the selected subscription.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, Context context);

    /**
     * Check the availability of a resource name. This API should be used to check the uniqueness of the name for
     * support ticket creation for the selected subscription.
     *
     * @param checkNameAvailabilityInput Input to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityOutputInner checkNameAvailability(CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Lists all the support tickets for an Azure subscription. You can also filter the support tickets by _Status_,
     * _CreatedDate_, _ServiceId_, and _ProblemClassificationId_ using the $filter parameter. Output will be a paged
     * result with _nextLink_, using which you can retrieve the next set of support tickets.
     * &lt;br/&gt;&lt;br/&gt;Support ticket data is available for 18 months after ticket creation. If a ticket was
     * created more than 18 months ago, a request for data might cause an error.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a collection of SupportTicket resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SupportTicketDetailsInner> list();

    /**
     * Lists all the support tickets for an Azure subscription. You can also filter the support tickets by _Status_,
     * _CreatedDate_, _ServiceId_, and _ProblemClassificationId_ using the $filter parameter. Output will be a paged
     * result with _nextLink_, using which you can retrieve the next set of support tickets.
     * &lt;br/&gt;&lt;br/&gt;Support ticket data is available for 18 months after ticket creation. If a ticket was
     * created more than 18 months ago, a request for data might cause an error.
     *
     * @param top The number of values to return in the collection. Default is 25 and max is 100.
     * @param filter The filter to apply on the operation. We support 'odata v4.0' filter semantics. [Learn
     *     more](https://docs.microsoft.com/odata/concepts/queryoptions-overview). _Status_, _ServiceId_, and
     *     _ProblemClassificationId_ filters can only be used with Equals ('eq') operator. For _CreatedDate_ filter, the
     *     supported operators are Greater Than ('gt') and Greater Than or Equals ('ge'). When using both filters,
     *     combine them using the logical 'AND'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents a collection of SupportTicket resources as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SupportTicketDetailsInner> list(Integer top, String filter, Context context);

    /**
     * Get ticket details for an Azure subscription. Support ticket data is available for 18 months after ticket
     * creation. If a ticket was created more than 18 months ago, a request for data might cause an error.
     *
     * @param supportTicketName Support ticket name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ticket details for an Azure subscription along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SupportTicketDetailsInner> getWithResponse(String supportTicketName, Context context);

    /**
     * Get ticket details for an Azure subscription. Support ticket data is available for 18 months after ticket
     * creation. If a ticket was created more than 18 months ago, a request for data might cause an error.
     *
     * @param supportTicketName Support ticket name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ticket details for an Azure subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SupportTicketDetailsInner get(String supportTicketName);

    /**
     * This API allows you to update the severity level, ticket status, advanced diagnostic consent and your contact
     * information in the support ticket.&lt;br/&gt;&lt;br/&gt;Note: The severity levels cannot be changed if a support
     * ticket is actively being worked upon by an Azure support engineer. In such a case, contact your support engineer
     * to request severity update by adding a new communication using the Communications API.
     *
     * @param supportTicketName Support ticket name.
     * @param updateSupportTicket UpdateSupportTicket object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents SupportTicketDetails resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SupportTicketDetailsInner> updateWithResponse(
        String supportTicketName, UpdateSupportTicket updateSupportTicket, Context context);

    /**
     * This API allows you to update the severity level, ticket status, advanced diagnostic consent and your contact
     * information in the support ticket.&lt;br/&gt;&lt;br/&gt;Note: The severity levels cannot be changed if a support
     * ticket is actively being worked upon by an Azure support engineer. In such a case, contact your support engineer
     * to request severity update by adding a new communication using the Communications API.
     *
     * @param supportTicketName Support ticket name.
     * @param updateSupportTicket UpdateSupportTicket object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents SupportTicketDetails resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SupportTicketDetailsInner update(String supportTicketName, UpdateSupportTicket updateSupportTicket);

    /**
     * Creates a new support ticket for Subscription and Service limits (Quota), Technical, Billing, and Subscription
     * Management issues for the specified subscription. Learn the [prerequisites](https://aka.ms/supportAPI) required
     * to create a support ticket.&lt;br/&gt;&lt;br/&gt;Always call the Services and ProblemClassifications API to get
     * the most recent set of services and problem categories required for support ticket
     * creation.&lt;br/&gt;&lt;br/&gt;Adding attachments is not currently supported via the API. To add a file to an
     * existing support ticket, visit the [Manage support
     * ticket](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/managesupportrequest) page in
     * the Azure portal, select the support ticket, and use the file upload control to add a new
     * file.&lt;br/&gt;&lt;br/&gt;Providing consent to share diagnostic information with Azure support is currently not
     * supported via the API. The Azure support engineer working on your ticket will reach out to you for consent if
     * your issue requires gathering diagnostic information from your Azure resources.&lt;br/&gt;&lt;br/&gt;**Creating a
     * support ticket for on-behalf-of**: Include _x-ms-authorization-auxiliary_ header to provide an auxiliary token as
     * per
     * [documentation](https://docs.microsoft.com/azure/azure-resource-manager/management/authenticate-multi-tenant).
     * The primary token will be from the tenant for whom a support ticket is being raised against the subscription,
     * i.e. Cloud solution provider (CSP) customer tenant. The auxiliary token will be from the Cloud solution provider
     * (CSP) partner tenant.
     *
     * @param supportTicketName Support ticket name.
     * @param createSupportTicketParameters Support ticket request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of object that represents SupportTicketDetails resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SupportTicketDetailsInner>, SupportTicketDetailsInner> beginCreate(
        String supportTicketName, SupportTicketDetailsInner createSupportTicketParameters);

    /**
     * Creates a new support ticket for Subscription and Service limits (Quota), Technical, Billing, and Subscription
     * Management issues for the specified subscription. Learn the [prerequisites](https://aka.ms/supportAPI) required
     * to create a support ticket.&lt;br/&gt;&lt;br/&gt;Always call the Services and ProblemClassifications API to get
     * the most recent set of services and problem categories required for support ticket
     * creation.&lt;br/&gt;&lt;br/&gt;Adding attachments is not currently supported via the API. To add a file to an
     * existing support ticket, visit the [Manage support
     * ticket](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/managesupportrequest) page in
     * the Azure portal, select the support ticket, and use the file upload control to add a new
     * file.&lt;br/&gt;&lt;br/&gt;Providing consent to share diagnostic information with Azure support is currently not
     * supported via the API. The Azure support engineer working on your ticket will reach out to you for consent if
     * your issue requires gathering diagnostic information from your Azure resources.&lt;br/&gt;&lt;br/&gt;**Creating a
     * support ticket for on-behalf-of**: Include _x-ms-authorization-auxiliary_ header to provide an auxiliary token as
     * per
     * [documentation](https://docs.microsoft.com/azure/azure-resource-manager/management/authenticate-multi-tenant).
     * The primary token will be from the tenant for whom a support ticket is being raised against the subscription,
     * i.e. Cloud solution provider (CSP) customer tenant. The auxiliary token will be from the Cloud solution provider
     * (CSP) partner tenant.
     *
     * @param supportTicketName Support ticket name.
     * @param createSupportTicketParameters Support ticket request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of object that represents SupportTicketDetails resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SupportTicketDetailsInner>, SupportTicketDetailsInner> beginCreate(
        String supportTicketName, SupportTicketDetailsInner createSupportTicketParameters, Context context);

    /**
     * Creates a new support ticket for Subscription and Service limits (Quota), Technical, Billing, and Subscription
     * Management issues for the specified subscription. Learn the [prerequisites](https://aka.ms/supportAPI) required
     * to create a support ticket.&lt;br/&gt;&lt;br/&gt;Always call the Services and ProblemClassifications API to get
     * the most recent set of services and problem categories required for support ticket
     * creation.&lt;br/&gt;&lt;br/&gt;Adding attachments is not currently supported via the API. To add a file to an
     * existing support ticket, visit the [Manage support
     * ticket](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/managesupportrequest) page in
     * the Azure portal, select the support ticket, and use the file upload control to add a new
     * file.&lt;br/&gt;&lt;br/&gt;Providing consent to share diagnostic information with Azure support is currently not
     * supported via the API. The Azure support engineer working on your ticket will reach out to you for consent if
     * your issue requires gathering diagnostic information from your Azure resources.&lt;br/&gt;&lt;br/&gt;**Creating a
     * support ticket for on-behalf-of**: Include _x-ms-authorization-auxiliary_ header to provide an auxiliary token as
     * per
     * [documentation](https://docs.microsoft.com/azure/azure-resource-manager/management/authenticate-multi-tenant).
     * The primary token will be from the tenant for whom a support ticket is being raised against the subscription,
     * i.e. Cloud solution provider (CSP) customer tenant. The auxiliary token will be from the Cloud solution provider
     * (CSP) partner tenant.
     *
     * @param supportTicketName Support ticket name.
     * @param createSupportTicketParameters Support ticket request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents SupportTicketDetails resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SupportTicketDetailsInner create(String supportTicketName, SupportTicketDetailsInner createSupportTicketParameters);

    /**
     * Creates a new support ticket for Subscription and Service limits (Quota), Technical, Billing, and Subscription
     * Management issues for the specified subscription. Learn the [prerequisites](https://aka.ms/supportAPI) required
     * to create a support ticket.&lt;br/&gt;&lt;br/&gt;Always call the Services and ProblemClassifications API to get
     * the most recent set of services and problem categories required for support ticket
     * creation.&lt;br/&gt;&lt;br/&gt;Adding attachments is not currently supported via the API. To add a file to an
     * existing support ticket, visit the [Manage support
     * ticket](https://portal.azure.com/#blade/Microsoft_Azure_Support/HelpAndSupportBlade/managesupportrequest) page in
     * the Azure portal, select the support ticket, and use the file upload control to add a new
     * file.&lt;br/&gt;&lt;br/&gt;Providing consent to share diagnostic information with Azure support is currently not
     * supported via the API. The Azure support engineer working on your ticket will reach out to you for consent if
     * your issue requires gathering diagnostic information from your Azure resources.&lt;br/&gt;&lt;br/&gt;**Creating a
     * support ticket for on-behalf-of**: Include _x-ms-authorization-auxiliary_ header to provide an auxiliary token as
     * per
     * [documentation](https://docs.microsoft.com/azure/azure-resource-manager/management/authenticate-multi-tenant).
     * The primary token will be from the tenant for whom a support ticket is being raised against the subscription,
     * i.e. Cloud solution provider (CSP) customer tenant. The auxiliary token will be from the Cloud solution provider
     * (CSP) partner tenant.
     *
     * @param supportTicketName Support ticket name.
     * @param createSupportTicketParameters Support ticket request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents SupportTicketDetails resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SupportTicketDetailsInner create(
        String supportTicketName, SupportTicketDetailsInner createSupportTicketParameters, Context context);
}
