package realtimepaymentarchitectureorchestration.orchestration;


/**
 * Represents the high-level orchestration steps in a real-time payment journey.
 * These values can be used to drive pipelines, workflow engines, or monitoring views.
 */
public enum OrchestrationStep {
    RECEIVE_REQUEST,
    AUTHENTICATE,
    VALIDATE,
    ENRICH,
    TRANSFORM_TO_ISO20022,
    FRAUD_CHECK,
    ROUTE,
    POST,
    NOTIFY,
    COMPLETE,
    ERROR
}
