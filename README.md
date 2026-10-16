# Centralized API Gateway Routing — Spring Boot

This Maven multi-module project contains three applications:
- `inventory-service` — port 8081
- `shipping-service` — port 8082
- `api-gateway` — port 8080

## Requirements
- JDK 17 or later
- Maven 3.9+
- Internet connection for Maven to download dependencies the first time

## Import into an IDE
1. Extract the ZIP.
2. In IntelliJ IDEA or Spring Tool Suite/Eclipse, choose **Open / Import Existing Maven Project**.
3. Select the extracted root folder containing the root `pom.xml`.
4. Wait for Maven dependencies to finish downloading.

## Run the applications
Start each application separately, in this order:
1. Run `InventoryServiceApplication` in `inventory-service`.
2. Run `ShippingServiceApplication` in `shipping-service`.
3. Run `ApiGatewayApplication` in `api-gateway`.

Alternatively, from a terminal in the extracted root folder, run each command in a separate terminal:
- `mvn -pl inventory-service spring-boot:run`
- `mvn -pl shipping-service spring-boot:run`
- `mvn -pl api-gateway spring-boot:run`

## Test endpoints
Direct backend tests:
- http://localhost:8081/inventory/items
- http://localhost:8082/shipping/status

Gateway tests:
- http://localhost:8080/inventory/items
- http://localhost:8080/shipping/status

Expected results: the inventory URL returns JSON with `service: Inventory Service` and item data; the shipping URL returns JSON with `service: Shipping Service` and shipment status.

## How routing works
- `/inventory/**` is forwarded to `http://localhost:8081` while preserving the path.
- `/shipping/**` is forwarded to `http://localhost:8082` while preserving the path.

No Eureka server is required for this question. The gateway routes directly to the two fixed local service URLs.
