package ro.redeul.google.go.imports;

import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import ro.redeul.google.go.GoEditorAwareTestCase;
import ro.redeul.google.go.lang.psi.GoFile;

public class GoImportOptimizerTest extends GoEditorAwareTestCase {
    public void testSimple() throws Exception { doTest(); }
    public void testRemoveWholeStatement() throws Exception { doTest(); }
    public void testNestedLiterals() throws Exception { doTest(); }

    @Override
    protected void invoke(Project project, Editor editor, GoFile file) {
        new GoImportOptimizer().processFile(file).run();
    }

    @Override
    protected String getTestDataRelativePath() {
        return "import/importOptimizer/";
    }
}
