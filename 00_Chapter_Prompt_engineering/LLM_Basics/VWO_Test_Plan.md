# VWO.com — Test Plan

**Product:** VWO – Digital Experience Optimization Platform
**Product URL (from PRD):** https://app.vwo.com/
**Chapter:** Chapter_01_LLM Basics
**Generated:** 2026-09-30
**Source of truth:** `Product Requirements Document (PRD) VWO.com.pdf` (extracted to `VWO_Test_Plan_Extracted_PRD.txt`)
**Governing rules:** `Anti-Hallucination_Rules.md` — output is organised in the mandated blocks (**Verified Facts → Missing/Unknown Information → Generated Output → Self-Validation Check**). Every test case traces to a PRD fact. Nothing is invented; where the PRD is silent the response is **"Insufficient information to determine."**

> **Scope note:** the PRD describes the VWO product at a capability level. It contains **no** screen-level UI specs, field lists, error codes, API contracts, or acceptance criteria. This test plan therefore verifies the stated capabilities and leaves detailed step-level expectations marked as unknown (see §2), rather than assuming them.

---

## 1. Verified Facts (extracted from the PRD)

| ID | Verified fact | PRD source |
| --- | --- | --- |
| F-01 | Product name is "VWO – Digital Experience Optimization Platform". | PRD p.1 |
| F-02 | Product URL is https://app.vwo.com/. | PRD p.1 |
| F-03 | Prepared by Pramod Dutta; dated January 7, 2026. | PRD p.1 |
| F-04 | VWO is an enterprise-grade Digital Experience Optimization (DXO) and Conversion Rate Optimization (CRO) platform. | §1 |
| F-05 | It enables businesses to understand user behaviour, test experiences, personalize interactions, and make data-driven decisions across web and mobile properties. | §1 |
| F-06 | Primary goals: improve conversion rates across key funnels (sign-ups, purchases, lead forms); test hypotheses with empirical data; reduce engineering dependency; provide unified insights across testing, personalization and analytics. | §2 |
| F-07 | Stakeholders: Digital Product Managers; UX/UI Designers; Growth & Marketing; Data Analysts/CRO Specialists; Engineering/DevOps. | §2 |
| F-08 | Primary users: CRO Specialists, Product Managers, UX Designers, Digital Marketers, Analysts. Secondary: Engineering teams, Business executives. | §3 |
| F-09 | Testing supports A/B Testing, Split URL Testing, Multivariate Testing. | §4.1 |
| F-10 | Audience targeting based on behaviours and attributes. | §4.1 |
| F-11 | Custom goals and metric configurations aligned with business KPIs. | §4.1 |
| F-12 | Bayesian-powered Intelligent stats engine ("SmartStats") produces accurate results. | §4.1 |
| F-13 | Version previews, cross-device/cross-browser QA, scheduling, and reporting are provided. | §4.1 |
| F-14 | Users can define experiments with multiple variations. | §4.1 |
| F-15 | Results are statistically validated and actionable reports are generated. | §4.1 |
| F-16 | Integration with analytics tools (Google Analytics, Mixpanel) for extended insights. | §4.1 |
| F-17 | Insights: Heatmaps (click, scroll, focus), session recordings, on-page surveys & feedback, funnel analytics to identify drop-off points. | §4.2 |
| F-18 | Personalization: segment users by geography, behaviour, demographics; deliver customized content in real-time. | §4.3 |
| F-19 | Program & Workflow Management: central planning interface, collaboration tools, Kanban-style workflows for experiment backlogs. | §4.4 |
| F-20 | Integrations include Shopify, Salesforce, Segment, Snowflake; WordPress, Drupal; CDPs and analytics systems; tracking & reporting tools. | §4.5 |
| F-21 | A/B test flow: 1) define hypothesis & target metrics; 2) select audience segment; 3) configure variations (visual or code editor); 4) launch and monitor; 5) review SmartStats and conclude winner. | §5.1 |
| F-22 | Behavioural analysis flow: 1) access Insights dashboard; 2) generate heatmaps/record sessions/set funnels; 3) correlate behaviour with test outcomes; 4) prioritize optimization ideas. | §5.2 |
| F-23 | Functional requirements FR-1…FR-9 with priorities (Must/High/Medium) — see Appendix A. | §6 |
| F-24 | Non-functional: Performance — responds within **2 seconds** for editing workflows; Security — **2FA, role-based access control, activity logs**; Scalability — support high visitor volumes without performance loss; Data Privacy — **GDPR, CCPA** and regional policy compliance; Reliability — **99.9% uptime SLA** for enterprise customers. | §7 |
| F-25 | Success metrics/KPIs: conversion-rate increase; experiment velocity per quarter; reduced engineering time; personalized-campaign engagement; CSAT/NPS for usability. | §8 |
| F-26 | Pricing varies by feature set, monthly tested users and plan tiers (Growth/Pro/Enterprise); free tiers available. | §9 |
| F-27 | Risks & mitigations: Technical Complexity (SDKs/docs/templates); Data Accuracy (SmartStats + cross-tool validation); User Adoption (guided tours, in-app support, analyst assistance). | §10 |
| F-28 | Future enhancements (not in current scope): AI-driven suggestion engine; native mobile SDK enhancements; predictive analytics & ROI forecasting. | §11 |
| F-29 | Glossary: CRO, A/B Test, SmartStats. | §12 |

---

## 2. Missing / Unknown Information

Declared rather than assumed, per Anti-Hallucination Rule 3.

1. **No acceptance criteria** are stated for any requirement — success conditions are capability-level only.
2. **No UI specification** — no screens, page names, field labels, button text, or component behaviour.
3. **No error codes, messages, or validation rules** — negative-path expected results cannot be derived.
4. **No API specification** — no endpoints, payloads, authentication flows, or rate limits.
5. **No supported browser/OS/device list** — the PRD mentions "cross-device/cross-browser QA" (F-13) but enumerates no devices or browsers.
6. **No concrete performance targets** beyond "2 seconds for editing workflows" (F-24); "high visitor volumes" is unquantified.
7. **No security implementation detail** beyond 2FA, RBAC and activity logs (F-24) — no password policy, session rules, or audit-log contents.
8. **No data-retention, consent, or privacy mechanism detail** behind the GDPR/CCPA claim (F-24).
9. **No environment/hosting details** — no staging URL, test-account setup, or data seeding approach.
10. **No experiment limits** — e.g. maximum variations, traffic split precision, or statistical thresholds (F-14).
11. **No localization/language requirements.**
12. **Pricing** (F-26) is cited to an external site (geteppo.com) and is not testable from the PRD.
13. **References are external websites** ("Website", geteppo.com) that were **not provided as input**; their content was not used.

**Consequence:** any test step or expected result not traceable to §1 is marked **"Insufficient information to determine."**

---

## 3. Generated Output

### 3.1 Purpose & objectives

To verify that the VWO platform delivers the capabilities stated in the PRD — experimentation and testing (F-09, F-14), the SmartStats engine (F-12, F-15), visual/code editors (F-13), behavioural insights (F-17), audience targeting (F-10), real-time reporting (F-23 FR-6), personalization (F-18), integrations (F-16, F-20), collaboration/workflow (F-19), and the non-functional requirements (F-24).

### 3.2 Scope

**In scope (from §1):**
- Experimentation: A/B, Split URL, Multivariate testing; multiple variations (F-09, F-14)
- SmartStats / Bayesian results and actionable reports (F-12, F-15)
- Visual (WYSIWYG) and code editors; version previews; scheduling (F-13, F-23 FR-3)
- Audience targeting / segmentation (F-10, F-23 FR-5)
- Heatmaps, session recordings, surveys, funnel analytics (F-17)
- Real-time reporting & dashboards (F-23 FR-6)
- Personalization engine (F-18, F-23 FR-7)
- Integrations / connectors (F-16, F-20, F-23 FR-8)
- Collaboration & workflow management (F-19, F-23 FR-9)
- User flows §5.1 and §5.2 (F-21, F-22)
- Non-functional: performance, security, scalability, data privacy, reliability (F-24)

**Out of scope (stated as future work in the PRD):**
- AI-driven suggestion engine; native mobile SDK enhancements; predictive analytics/ROI forecasting (F-28)
- Pricing/licensing behaviour (F-26 — not a testable product feature in the PRD)

### 3.3 References

- `Product Requirements Document (PRD) VWO.com.pdf` (the only product input)
- `Anti-Hallucination_Rules.md` (governing rules)
- Extracted text: `VWO_Test_Plan_Extracted_PRD.txt`

### 3.4 Test strategy

| Area | What is verified | Traces to |
| --- | --- | --- |
| Functional | Each FR-1…FR-9 behaves as described | §6 (F-23) |
| User-flow (E2E) | The two documented flows complete | §5 (F-21, F-22) |
| Analytics/tracking | Insights data captured and correlated with test outcomes | §4.2 (F-17, F-22) |
| Experiment integrity | Multiple variations run; Bayesian results returned | §4.1 (F-12, F-14, F-15) |
| UI/editor | WYSIWYG and code editing available; previews | §4.1 (F-13, FR-3) |
| Integration | Connectors sync data with listed platforms | §4.5 (F-20), §4.1 (F-16) |
| Non-functional | Performance, security, scalability, privacy, reliability | §7 (F-24) |
| Negative/edge | **Insufficient information to determine** (no rules given) | §2 items 3, 10 |

### 3.5 Test environment & browser/device matrix

**Insufficient information to determine** — the PRD lists no environments, browsers, OSes or devices (F-13 mentions cross-device/cross-browser QA without enumeration; §2 item 5).

*Proposed default (Inference — low confidence, pending PRD confirmation):* current versions of Chrome, Firefox, Edge, Safari on desktop; one iOS and one Android device; over the staging environment. This is a **proposal, not a PRD fact**.

### 3.6 Test data & preconditions

Observable from the PRD: tests require a VWO account/workspace, at least one testable web property, defined audience segments, and target metrics (F-10, F-18, F-21). Exact account provisioning, seeding and tenant setup are **Insufficient information to determine** (§2 item 9).

### 3.7 Requirement Traceability Matrix

| Requirement | Description (PRD) | Priority | Test cases |
| --- | --- | --- | --- |
| FR-1 | A/B, Split & Multivariate Testing — multiple variations | Must | TC-01, TC-02, TC-03 |
| FR-2 | SmartStats Engine — Bayesian analysis | Must | TC-04, TC-05 |
| FR-3 | Visual & Code Editor — WYSIWYG + developer setup | Must | TC-06, TC-07 |
| FR-4 | Heatmaps & Session Recordings | Must | TC-08, TC-09 |
| FR-5 | Audience Targeting — behavioural segmentation | High | TC-10 |
| FR-6 | Real-time Reporting & Dashboards | Must | TC-11 |
| FR-7 | Personalization Engine — tailored experiences | High | TC-12 |
| FR-8 | Integration Connectors — sync with external platforms | High | TC-13 |
| FR-9 | Collaboration & Workflow Management | Medium | TC-14 |
| NFR-P | Performance — ≤ 2s editing workflows | — | TC-15 |
| NFR-S | Security — 2FA, RBAC, activity logs | — | TC-16 |
| NFR-SC | Scalability — high visitor volumes | — | TC-17 |
| NFR-DP | Data Privacy — GDPR/CCPA | — | TC-18 |
| NFR-R | Reliability — 99.9% uptime SLA | — | TC-19 |
| UF-1 | User flow §5.1 — set up an A/B test | — | TC-20 |
| UF-2 | User flow §5.2 — analyse behavioural data | — | TC-21 |
| CAP-1 | Version previews + cross-device/browser QA + scheduling | — | TC-22 |
| CAP-2 | On-page surveys & feedback | — | TC-23 |
| CAP-3 | Funnel analytics / drop-off points | — | TC-24 |
| CAP-4 | Custom goals & metric configuration | — | TC-25 |

### 3.8 Test cases

Each expected result restates the PRD requirement; nothing beyond it is assumed.

| TC | Requirement | Title | Steps (summary) | Expected result (per PRD) | Prio | Type |
| --- | --- | --- | --- | --- | --- | --- |
| TC-01 | FR-1 | Run an A/B test | Create an experiment with 2+ variations; add target metric; launch; observe traffic | Experiment with multiple variations executes (F-14, F-21) | Must | Functional |
| TC-02 | FR-1 | Run a Split URL test | Configure a Split URL test across two URLs; launch | Split URL testing is supported and runs (F-09) | Must | Functional |
| TC-03 | FR-1 | Run a Multivariate test | Configure multiple factors/combinations; launch | Multivariate testing is supported and runs (F-09) | Must | Functional |
| TC-04 | FR-2 | SmartStats Bayesian result | After a test accrues data, open results | Bayesian analysis (SmartStats) is presented (F-12) | Must | Functional |
| TC-05 | FR-2 | Statistically validated report | Open the experiment report | Results are statistically validated; actionable report generated (F-15) | Must | Functional |
| TC-06 | FR-3 | Visual (WYSIWYG) edit | Edit a variation via the visual editor | WYSIWYG editing is available (F-13, FR-3) | Must | UI/Functional |
| TC-07 | FR-3 | Code editor edit | Edit a variation via the code editor | Developer-level (code) setup is available (FR-3) | Must | Functional |
| TC-08 | FR-4 | Heatmaps | Open Insights; generate click/scroll/focus heatmaps | Click, scroll and focus heatmaps are produced (F-17) | Must | Functional |
| TC-09 | FR-4 | Session recordings | Record and review a session | User interactions are captured as session recordings (F-17) | Must | Functional |
| TC-10 | FR-5 | Audience targeting | Define a segment by behaviour/attributes; run a test for it | Segmentation by behaviours/attributes is applied (F-10) | High | Functional |
| TC-11 | FR-6 | Real-time reporting | Open the dashboard during an active test | Up-to-date experiment analytics are shown (FR-6) | Must | Functional |
| TC-12 | FR-7 | Personalization delivery | Segment by geography/behaviour/demographics; deliver content | Tailored content delivered in real-time to the segment (F-18) | High | Functional |
| TC-13 | FR-8 | Integration connector | Connect one listed platform (e.g. Google Analytics / Shopify) and observe sync | Data syncs with the external platform (F-16, F-20) | High | Integration |
| TC-14 | FR-9 | Kanban workflow | Create/move an experiment in the Kanban backlog | Kanban-style workflow and collaboration are available (F-19) | Medium | Functional |
| TC-15 | NFR-P | Editing performance | Perform an editing workflow; measure response | Response within 2 seconds (F-24) | Must | Performance |
| TC-16 | NFR-S | Security controls | Verify 2FA, RBAC and activity logs | 2FA, role-based access control and activity logs exist (F-24) | Must | Security |
| TC-17 | NFR-SC | Scalability | Drive high visitor volume; observe performance | No performance loss at high volumes (F-24) — *threshold unknown (§2 item 6)* | High | Performance |
| TC-18 | NFR-DP | Data privacy | Review GDPR/CCPA and regional-policy handling | Compliance with GDPR, CCPA and regional policies (F-24) | High | Compliance |
| TC-19 | NFR-R | Uptime SLA | Review uptime against SLA over a period | 99.9% uptime for enterprise customers (F-24) | High | Reliability |
| TC-20 | UF-1 | A/B setup E2E | Follow §5.1 steps 1→5 end to end | Flow completes; winner concluded from SmartStats (F-21) | Must | E2E |
| TC-21 | UF-2 | Behavioural analysis E2E | Follow §5.2 steps 1→4 | Insights accessed; heatmaps/sessions/funnels; correlated with outcomes (F-22) | High | E2E |
| TC-22 | CAP-1 | Previews, cross-device QA, scheduling | Use version preview/QA/scheduling on a test | Previews, cross-device/browser QA, scheduling work (F-13) | High | Functional |
| TC-23 | CAP-2 | On-page survey/feedback | Publish an on-page survey/feedback | On-page surveys & feedback capture responses (F-17) | Medium | Functional |
| TC-24 | CAP-3 | Funnel analytics | Define a funnel; inspect drop-off | Funnel analytics identifies drop-off points (F-17) | Medium | Functional |
| TC-25 | CAP-4 | Custom goals/metrics | Configure a custom goal/metric | Custom goals and metric configs aligned to KPIs (F-11) | High | Functional |

**Negative / edge cases:** **Insufficient information to determine** — the PRD defines no validation rules, limits or error behaviour (§2 items 3, 10). No negative test cases can be specified from the PRD.

### 3.9 Entry / exit / suspension criteria

**Insufficient information to determine** from the PRD. *Proposed (Inference — low confidence):* entry — accessible account, target property and test data ready; exit — all Must-priority cases pass and no Critical/High defects open; suspension — environment unavailable or a blocking defect prevents execution.

### 3.10 Defect severity & priority

**Insufficient information to determine** — the PRD defines no severity model. *Proposed (Inference — low confidence):* Critical (capability unusable) / High (Must requirement broken) / Medium (High requirement affected) / Low (cosmetic).

### 3.11 Risks & mitigations (as stated in the PRD)

| Risk | Mitigation (PRD §10) | Test implication |
| --- | --- | --- |
| Technical Complexity | Robust SDKs/docs, pre-built templates | Verify documented setup paths work (TC-01, TC-06, TC-07) |
| Data Accuracy | SmartStats + cross-tool validation | Verify Bayesian results and integration consistency (TC-04, TC-05, TC-13) |
| User Adoption | Guided tours, in-app support, analyst assistance | UX/usability checks (TC-20, TC-21) |

### 3.12 Roles & responsibilities

Stakeholder groups are listed in the PRD (F-07, F-08). Specific test roles/owners are **Insufficient information to determine**.

---

## 4. Self-Validation Check

| # | Check | Result | Detail |
| --- | --- | --- | --- |
| 1 | Every test case traces to a PRD fact | **pass** | Each TC cites F-## / FR-# from §1 |
| 2 | No invented features or behaviour | **pass** | Only PRD-stated capabilities are tested |
| 3 | Missing information declared, not filled | **pass** | §2 lists 13 gaps; unknowns marked "Insufficient information to determine" |
| 4 | Inferences labelled | **pass** | Environment matrix, entry/exit criteria and severity model marked "Inference — low confidence" |
| 5 | Deterministic, repeatable output | **pass** | Stable IDs (F, FR, TC); no random or environment-specific assumptions |
| 6 | Traceability complete | **pass** | 9 FRs + 5 NFRs + 2 flows + 4 capabilities all mapped to ≥1 TC |
| 7 | Source clarity | **pass** | Only the PRD and the rules are used; external references excluded |

**Overall result:** Validated. The test plan covers the PRD's stated capabilities and non-functional requirements with full traceability, and explicitly declares the PRD's information gaps rather than inventing detail.

**Known residual risks**
- The PRD is capability-level; execution-level steps will need supplementary specs (UI, API, error handling).
- "High visitor volumes", statistical thresholds and device matrices are not quantified in the PRD.

---

## Appendix A — PRD functional requirements (verbatim)

| ID | Feature | Priority | Description |
| --- | --- | --- | --- |
| FR-1 | A/B, Split & Multivariate Testing | Must | Execute experiments with multiple variations. |
| FR-2 | SmartStats Engine | Must | Provide Bayesian analysis for test results. |
| FR-3 | Visual & Code Editor | Must | Support WYSIWYG and developer-level experiment setup. |
| FR-4 | Heatmaps & Session Recordings | Must | Capture user interactions for insights. |
| FR-5 | Audience Targeting | High | Enable segmentation based on behaviors. |
| FR-6 | Real-time Reporting & Dashboards | Must | Deliver up-to-date experiment analytics. |
| FR-7 | Personalization Engine | High | Deliver tailored experiences to segments. |
| FR-8 | Integration Connectors | High | Sync data with external platforms. |
| FR-9 | Collaboration & Workflow Management | Medium | Tools for planning and team tasks. |

## Appendix B — Glossary (PRD §12)

- **CRO** — Conversion Rate Optimization
- **A/B Test** — Controlled experiment comparing variants
- **SmartStats** — Bayesian statistical engine for experiment results
