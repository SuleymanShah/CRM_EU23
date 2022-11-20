

  @AGLP-1635
  Feature: crm Application features
    Agile story: As a user, I should be able to find people,
    documents and more by using top-page search bar;
    so that I can access the searched data

    1. User can see the conversations
    2. User can find related items to written keyword
    3. User can find group

    Background: user is on the login page
      Given user "hr1" is already logged in

      @Sec1
      Scenario:User can see the conversations
        When user clicks on search icon
        Then user sees conversations

        @Sec2
        Scenario: User can find related items to written keyword
          When user clicks on item search bar
          Then user sees intended search items

          @Sec3
          Scenario: User can find group
            When user clicks on item search bar
            Then user sees intended search groups