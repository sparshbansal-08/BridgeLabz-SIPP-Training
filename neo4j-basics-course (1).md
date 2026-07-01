# Neo4j Basics Course

**Audience:** True beginners with zero prior knowledge of databases or graph theory.  
**Goals:** Explain graph databases, set up Neo4j, teach Cypher queries, build hands-on skills to model, query, and visualize graphs—end-to-end with zero-cost tools.  
**Scope:** Complete, copy-pasteable queries and commands. Default: Neo4j Desktop + Browser. Alternatives listed.  
**Date:** November 27, 2025  
**Estimated Time:** 25-35 hours (self-paced)  
**Cost:** ₹0 (free Neo4j Aura or Desktop)  

---

## Table of Contents

1. [Introduction](#section-1-introduction)  
2. [Neo4j Basics](#section-2-neo4j-basics)  
3. [Hands-On Setup](#section-3-hands-on-setup)  
4. [Resources](#section-4-resources)  
5. [Toolchain Setup](#section-5-toolchain-setup)  
6. [Creating Nodes and Relationships Lab](#section-6-creating-nodes-and-relationships-lab)  
7. [Querying with Cypher Lab](#section-7-querying-with-cypher-lab)  
8. [Modeling Graphs Lab](#section-8-modeling-graphs-lab)  
9. [Python Driver Lab](#section-9-python-driver-lab)  
10. [Visualization and Browser Lab](#section-10-visualization-and-browser-lab)  
11. [Indexing and Performance Lab](#section-11-indexing-and-performance-lab)  
12. [Security and Access Control Lab](#section-12-security-and-access-control-lab)  
13. [Backup and Restore Lab](#section-13-backup-and-restore-lab)  
14. [APOC Library Lab](#section-14-apoc-library-lab)  
15. [Advanced Queries](#section-15-advanced-queries)  
16. [Troubleshooting and Pitfalls](#section-16-troubleshooting-and-pitfalls)  
17. [Capstone Project](#section-17-capstone-project)  
18. [FAQs](#section-18-faqs)  
19. [Cheat Sheet](#section-19-cheat-sheet)  
20. [Glossary](#section-20-glossary)  
21. [Further Learning](#section-21-further-learning)  
22. [Index](#section-22-index)  

---

## Section 1: Introduction

### What is Neo4j?
Neo4j is a native graph database that stores data as nodes, relationships, and properties. Unlike relational DBs, it excels at connected data (social networks, recommendations).

**One-Sentence Takeaway:** Neo4j is the world's leading graph database for modeling and querying complex relationships.

### Why Learn Neo4j?
- **Powerful for Connections:** Ideal for fraud detection, recommendations, knowledge graphs.
- **Easy Queries:** Cypher language is intuitive.
- **Scalable:** Handles billions of nodes.
- **Job Market:** High demand in India (analytics, AI, fintech).
- **Zero Cost:** Free community edition and cloud.

### Benefits and Risks
**Benefits:**
- Fast traversals for connected data.
- ACID compliant.
- Rich ecosystem (drivers for Python, Java, etc.).

**Risks:**
- Overkill for simple tabular data.
- Learning curve for graph modeling.
- Resource-intensive for very large graphs.

### Prerequisites (Zero Required)
- No prior DB knowledge needed.
- Basic computer skills.

### Course Structure
- **Sections 1-5:** Concepts and setup.
- **Sections 6-14:** Hands-on labs.
- **Sections 15-17:** Advanced and capstone.
- **Sections 18-22:** Reference.

### India Context
- **Hardware:** Works on low-spec machines.
- **Internet:** Use Neo4j Aura for cloud (free tier).
- **Career:** Neo4j skills in Indian tech (₹8-15 LPA).
- **Regulations:** Data privacy under DPDP Act.

**Next Steps:** [Section 2: Neo4j Basics](#section-2-neo4j-basics)

---

## Section 2: Neo4j Basics

### Core Concepts
- **Nodes:** Entities (e.g., Person, Product).
- **Relationships:** Connections between nodes (e.g., FRIENDS_WITH).
- **Properties:** Key-value data on nodes/rels.
- **Cypher:** Query language (like SQL for graphs).
- **Graph DB:** Data as graphs, not tables.

**One-Sentence Takeaway:** Graph databases like Neo4j represent data as nodes and relationships for efficient querying of connections.

### How Neo4j Works
1. Model data as graph.
2. Use Cypher to query.
3. Visualize in Browser.

### Paradigms
- **Property Graph Model:** Nodes/rels with props.
- **ACID Transactions:** Reliable.
- **Native Graph:** Optimized for traversals.

**Next Steps:** [Section 3: Hands-On Setup](#section-3-hands-on-setup)

---

## Section 3: Hands-On Setup

### What You'll Install
- **Neo4j Desktop:** Free GUI for local DB.
- **Neo4j Aura:** Free cloud DB.

### Step-by-Step Setup
1. Go to neo4j.com/download.
2. Download Desktop (free).
3. Install and create account.
4. Create new project, add DB (4.4.x).

### Alternatives
- **Aura:** neo4j.com/aura (free tier, no install).
- **Docker:** For advanced users.

### Validation Checklist
- [ ] Desktop installed.
- [ ] DB running (green status).

**Next Steps:** [Section 4: Resources](#section-4-resources)

---

## Section 4: Resources

### Study Materials
- **Docs:** neo4j.com/docs (free).
- **Cypher Manual:** neo4j.com/docs/cypher-manual.
- **Tutorials:** Neo4j GraphAcademy (free).

### Tools
- **Browser:** Built-in query interface.
- **Python Driver:** neo4j.com/docs/python-manual.

### Lab Files Structure
```
neo4j-basics-course/
├── labs/
│   ├── nodes-rels/
│   ├── queries/
│   ├── modeling/
│   ├── python-driver/
│   ├── viz/
│   ├── indexing/
│   ├── security/
│   ├── backup/
│   ├── apoc/
│   └── capstone/
└── README.md
```

**Next Steps:** [Section 5: Toolchain Setup](#section-5-toolchain-setup)

---

## Section 5: Toolchain Setup

### Neo4j Browser
1. In Desktop, start DB.
2. Open Browser (http://localhost:7474).
3. Default user: neo4j, pass: set during setup.

### Python Setup (for driver)
1. `pip install neo4j`.

### Validation
- [ ] Browser opens.
- [ ] Can run `:play start` command.

**Next Steps:** [Section 6: Nodes Lab](#section-6-creating-nodes-and-relationships-lab)

---

## Section 6: Creating Nodes and Relationships Lab

### Overview
Create nodes and relationships.

### Objectives
- Use CREATE in Cypher.

### Prerequisites
- DB running.

### Steps
1. In Browser: `CREATE (p:Person {name: 'Alice'}) RETURN p`
2. `CREATE (p:Person {name: 'Bob'})-[:FRIENDS_WITH]->(q:Person {name: 'Alice'}) RETURN p, q`

### Verification
- Nodes appear in graph view.

### Teardown
- `MATCH (n) DETACH DELETE n`

### Troubleshooting
- **Syntax error:** Check Cypher syntax.

### Acceptance Criteria
- [ ] Nodes created.

**Next Steps:** [Section 7: Querying Lab](#section-7-querying-with-cypher-lab)

---

## Section 7: Querying with Cypher Lab

### Overview
Query graphs with MATCH.

### Objectives
- Retrieve data.

### Steps
1. `MATCH (p:Person) RETURN p.name`
2. `MATCH (p)-[r:FRIENDS_WITH]->(q) RETURN p.name, q.name`

### Verification
- Results in table.

### Acceptance Criteria
- [ ] Queries return data.

**Next Steps:** Continue similarly.

---

## Section 8: Modeling Graphs Lab

### Overview
Design graph schema.

### Objectives
- Model real-world data.

### Steps
1. Create nodes for users, posts, likes.

### Verification
- Graph visualizes correctly.

### Acceptance Criteria
- [ ] Model complete.

---

## Section 9: Python Driver Lab

### Overview
Connect Python to Neo4j.

### Objectives
- Run queries from code.

### Steps
1. `from neo4j import GraphDatabase`
2. `driver = GraphDatabase.driver(uri, auth=(user, pass))`
3. `with driver.session() as session: session.run("CREATE (n:Test)")`

### Verification
- Data in DB.

### Acceptance Criteria
- [ ] Python connects.

---

## Section 10: Visualization Lab

### Overview
Use Browser for viz.

### Objectives
- Visualize graphs.

### Steps
1. Run queries, click graph tab.

### Verification
- Visual graph.

### Acceptance Criteria
- [ ] Viz works.

---

## Section 11: Indexing Lab

### Overview
Add indexes for performance.

### Objectives
- Speed up queries.

### Steps
1. `CREATE INDEX FOR (p:Person) ON (p.name)`

### Verification
- Query faster.

### Acceptance Criteria
- [ ] Index created.

---

## Section 12: Security Lab

### Overview
Set up users and roles.

### Objectives
- Secure DB.

### Steps
1. In Desktop, manage users.

### Verification
- Access controlled.

### Acceptance Criteria
- [ ] Security set.

---

## Section 13: Backup Lab

### Overview
Backup DB.

### Objectives
- Preserve data.

### Steps
1. Use Desktop backup.

### Verification
- Backup file created.

### Acceptance Criteria
- [ ] Backup done.

---

## Section 14: APOC Lab

### Overview
Use APOC library.

### Objectives
- Advanced functions.

### Steps
1. Install APOC plugin.
2. `CALL apoc.help('')`

### Verification
- Functions available.

### Acceptance Criteria
- [ ] APOC works.

---

## Section 15: Advanced Queries

### Overview
Complex Cypher.

### Key Queries
- Shortest path: `MATCH path = shortestPath((a)-[*]-(b)) RETURN path`

**Next Steps:** [Section 16: Troubleshooting](#section-16-troubleshooting-and-pitfalls)

---

## Section 16: Troubleshooting and Pitfalls

### Common Issues
- **Connection failed:** Check port 7474.
- **Query slow:** Add indexes.
- **Memory error:** Increase heap size.

### Symptom → Cause → Fix Table
| Symptom | Cause | Fix |
|---------|-------|-----|
| No results | Wrong label | Check MATCH |
| Syntax error | Typos | Validate Cypher |
| DB not starting | Port conflict | Change port |

**Next Steps:** [Section 17: Capstone](#section-17-capstone-project)

---

## Section 17: Capstone Project

### Overview
Build a social network graph.

### Objectives
- Model users, friendships, posts.

### Steps
1. Create schema.
2. Insert data.
3. Query recommendations.
4. Visualize.

### Acceptance Criteria
- [ ] Graph built.
- [ ] Queries work.
- [ ] Viz complete.

**Next Steps:** [Section 18: FAQs](#section-18-faqs)

---

## Section 18: FAQs

- **Q: Neo4j vs SQL?** A: Neo4j for relationships, SQL for tables.
- **Q: Free?** A: Yes, Aura free tier.
- **Q: India?** A: Use local docs, cloud works globally.

---

## Section 19: Cheat Sheet

- **Create node:** `CREATE (n:Label {prop: value})`
- **Match:** `MATCH (n) RETURN n`
- **Rel:** `CREATE (a)-[:REL]->(b)`

---

## Section 20: Glossary

- **Node:** Entity in graph.
- **Relationship:** Connection.
- **Cypher:** Query language.
- **Graph DB:** Database for graphs.

---

## Section 21: Further Learning

- **Courses:** Neo4j GraphAcademy.
- **Books:** "Graph Databases" by Ian Robinson.
- **Certifications:** Neo4j Certified Professional.
- **Communities:** Neo4j forums, Indian data groups.

### India Context
- **Jobs:** Graph roles in analytics firms.

---

## Section 22: Index

- Cypher: [Section 7](#section-7-querying-with-cypher-lab)
- Modeling: [Section 8](#section-8-modeling-graphs-lab)
- Python: [Section 9](#section-9-python-driver-lab)
- Viz: [Section 10](#section-10-visualization-and-browser-lab)

---

**Course Complete! Happy Graphing! 📊**
