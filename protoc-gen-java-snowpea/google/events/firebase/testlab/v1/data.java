|- TestMatrixEventData(create_time: Timestamp, state: ENUM, invalid_matrix_details: STRING, outcome_summary: ENUM, result_storage: ResultStorage, client_info: ClientInfo, test_matrix_id: STRING)
|- ClientInfo(client: STRING, details: List<DetailsEntry>)
   |- DetailsEntry(key: STRING, value: STRING)
   |- ResultStorage(tool_results_history: STRING, tool_results_execution: STRING, results_uri: STRING, gcs_path: STRING)
