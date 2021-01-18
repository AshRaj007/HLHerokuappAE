$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DataTablesExercise.feature");
formatter.feature({
  "line": 1,
  "name": "Data Table Sorting",
  "description": "",
  "id": "data-table-sorting",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Sort Table1 in Ascending and Descending",
  "description": "",
  "id": "data-table-sorting;sort-table1-in-ascending-and-descending",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@table1test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on Sortable Data Tables",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can sort the table in \"\u003corder\u003e\" by \"\u003cfield\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "data-table-sorting;sort-table1-in-ascending-and-descending;",
  "rows": [
    {
      "cells": [
        "order",
        "field"
      ],
      "line": 15,
      "id": "data-table-sorting;sort-table1-in-ascending-and-descending;;1"
    },
    {
      "cells": [
        "Ascending",
        "Last Name"
      ],
      "line": 16,
      "id": "data-table-sorting;sort-table1-in-ascending-and-descending;;2"
    },
    {
      "cells": [
        "Descending",
        "First Name"
      ],
      "line": 17,
      "id": "data-table-sorting;sort-table1-in-ascending-and-descending;;3"
    },
    {
      "cells": [
        "Descending",
        "Last Name"
      ],
      "line": 18,
      "id": "data-table-sorting;sort-table1-in-ascending-and-descending;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "To be on The Internet Herokuapp",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Herokuapp website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.iAmOnHerokuappWebsite()"
});
formatter.result({
  "duration": 303541976,
  "error_message": "java.lang.NullPointerException\n\tat pageModels.HomePage.checkURL(HomePage.java:22)\n\tat stepDefinitions.HomePageStepDefs.iAmOnHerokuappWebsite(HomePageStepDefs.java:20)\n\tat ✽.Given I am on Herokuapp website(DataTablesExercise.feature:4)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 16,
  "name": "Sort Table1 in Ascending and Descending",
  "description": "",
  "id": "data-table-sorting;sort-table1-in-ascending-and-descending;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@table1test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on Sortable Data Tables",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can sort the table in \"Ascending\" by \"Last Name\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.IClickOnSortableDataTables()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Ascending",
      "offset": 25
    },
    {
      "val": "Last Name",
      "offset": 40
    }
  ],
  "location": "TablesPageStepDefs.iCanSortTheTableInBy(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "To be on The Internet Herokuapp",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Herokuapp website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.iAmOnHerokuappWebsite()"
});
formatter.result({
  "duration": 753428,
  "error_message": "java.lang.NullPointerException\n\tat pageModels.HomePage.checkURL(HomePage.java:22)\n\tat stepDefinitions.HomePageStepDefs.iAmOnHerokuappWebsite(HomePageStepDefs.java:20)\n\tat ✽.Given I am on Herokuapp website(DataTablesExercise.feature:4)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 17,
  "name": "Sort Table1 in Ascending and Descending",
  "description": "",
  "id": "data-table-sorting;sort-table1-in-ascending-and-descending;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@table1test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on Sortable Data Tables",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can sort the table in \"Descending\" by \"First Name\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.IClickOnSortableDataTables()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Descending",
      "offset": 25
    },
    {
      "val": "First Name",
      "offset": 41
    }
  ],
  "location": "TablesPageStepDefs.iCanSortTheTableInBy(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "To be on The Internet Herokuapp",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Herokuapp website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.iAmOnHerokuappWebsite()"
});
formatter.result({
  "duration": 544179,
  "error_message": "java.lang.NullPointerException\n\tat pageModels.HomePage.checkURL(HomePage.java:22)\n\tat stepDefinitions.HomePageStepDefs.iAmOnHerokuappWebsite(HomePageStepDefs.java:20)\n\tat ✽.Given I am on Herokuapp website(DataTablesExercise.feature:4)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 18,
  "name": "Sort Table1 in Ascending and Descending",
  "description": "",
  "id": "data-table-sorting;sort-table1-in-ascending-and-descending;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@table1test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click on Sortable Data Tables",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I can sort the table in \"Descending\" by \"Last Name\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.IClickOnSortableDataTables()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Descending",
      "offset": 25
    },
    {
      "val": "Last Name",
      "offset": 41
    }
  ],
  "location": "TablesPageStepDefs.iCanSortTheTableInBy(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 3,
  "name": "To be on The Internet Herokuapp",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on Herokuapp website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.iAmOnHerokuappWebsite()"
});
formatter.result({
  "duration": 398365,
  "error_message": "java.lang.NullPointerException\n\tat pageModels.HomePage.checkURL(HomePage.java:22)\n\tat stepDefinitions.HomePageStepDefs.iAmOnHerokuappWebsite(HomePageStepDefs.java:20)\n\tat ✽.Given I am on Herokuapp website(DataTablesExercise.feature:4)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 21,
  "name": "Sort Table2 with ID and Class attributes using Last Name",
  "description": "",
  "id": "data-table-sorting;sort-table2-with-id-and-class-attributes-using-last-name",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@table2test"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I click on Sortable Data Tables",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I can see the following displayed:",
  "rows": [
    {
      "cells": [
        "Smith",
        "John",
        "jsmith@gmail.com",
        "$50.00",
        "http://www.jsmith.com"
      ],
      "line": 25
    },
    {
      "cells": [
        "Bach",
        "Frank",
        "fbach@yahoo.com",
        "$51.00",
        "http://www.frank.com"
      ],
      "line": 26
    },
    {
      "cells": [
        "Doe",
        "Jason",
        "jdoe@hotmail.com",
        "$100.00",
        "http://www.jdoe.com"
      ],
      "line": 27
    },
    {
      "cells": [
        "Conway",
        "Tim",
        "tconway@earthlink.net",
        "$50.00",
        "http://www.timconway.com"
      ],
      "line": 28
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I click on Due to sort",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "I can see the following displayed:",
  "rows": [
    {
      "cells": [
        "Smith",
        "John",
        "jsmith@gmail.com",
        "$50.00",
        "http://www.jsmith.com"
      ],
      "line": 32
    },
    {
      "cells": [
        "Conway",
        "Tim",
        "tconway@earthlink.net",
        "$50.00",
        "http://www.timconway.com"
      ],
      "line": 33
    },
    {
      "cells": [
        "Bach",
        "Frank",
        "fbach@yahoo.com",
        "$51.00",
        "http://www.frank.com"
      ],
      "line": 34
    },
    {
      "cells": [
        "Doe",
        "Jason",
        "jdoe@hotmail.com",
        "$100.00",
        "http://www.jdoe.com"
      ],
      "line": 35
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.IClickOnSortableDataTables()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TablesPageStepDefs.iCanSeeTheFollowingDisplayed(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TablesPageStepDefs.iClickOnDueToSort()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TablesPageStepDefs.iCanSeeTheFollowingDisplayed(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});