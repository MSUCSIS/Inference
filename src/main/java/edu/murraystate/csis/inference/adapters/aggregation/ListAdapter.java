package edu.murraystate.csis.inference.adapters.aggregation;

import edu.murraystate.csis.inference.adapters.TestAdapter;
import edu.murraystate.csis.inference.tests.TestResult;
import edu.murraystate.csis.inference.tests.TypeTester;

import java.util.List;
import java.util.stream.Collectors;

public class ListAdapter implements TestAdapter<List<String>, List<TestResult>> {
    private final TypeTester tester;

    public ListAdapter(final TypeTester tester) {
        this.tester = tester;
    }

    @Override
    public List<TestResult> test(final List<String> input) {
        return input
                .stream()
                .map(tester::test)
                .collect(Collectors.toList());
    }
}
